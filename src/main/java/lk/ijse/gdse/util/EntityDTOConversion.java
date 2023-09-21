package lk.ijse.gdse.util;

import lk.ijse.gdse.dto.TechLeadDTO;
import lk.ijse.gdse.entity.TechLead;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EntityDTOConversion {

    private final ModelMapper modelMapper;

    EntityDTOConversion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public TechLead getTechLeadEntity(TechLeadDTO techLeadDTO) {
        return modelMapper.map(techLeadDTO, TechLead.class);
    }
    public TechLeadDTO getTechLeadDTO(TechLead techLead) {
        return modelMapper.map(techLead, TechLeadDTO.class);
    }
}
