package lk.ijse.gdse.service.util;

import lk.ijse.gdse.dto.TechLeadDTO;
import lk.ijse.gdse.entity.TechLead;
import lk.ijse.gdse.repository.TechLeadRepository;
import lk.ijse.gdse.service.TechLeadService;
import lk.ijse.gdse.util.EntityDTOConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class TechLeadServiceIMPL implements TechLeadService {

    @Autowired
    TechLeadRepository techLeadRepository;

    @Autowired
    EntityDTOConversion conversion;
    @Override
    public TechLeadDTO saveTechLead(TechLeadDTO techLeadDTO) {
        techLeadDTO.setId(UUID.randomUUID().toString());
        TechLead techLead = conversion.getTechLeadEntity(techLeadDTO);
        techLeadRepository.save(techLead);
        return techLeadDTO;
    }

    @Override
    public void deleteTechLead(String id) {

    }

    @Override
    public void updateTechLead(String id, TechLeadDTO techLeadDTO) {

    }

    @Override
    public TechLeadDTO getTechLeadbyID(String id) {
        return null;
    }
}
