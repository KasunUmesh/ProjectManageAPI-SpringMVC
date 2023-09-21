package lk.ijse.gdse.service;

import lk.ijse.gdse.dto.TechLeadDTO;

public interface TechLeadService {
    TechLeadDTO saveTechLead(TechLeadDTO techLeadDTO);
    void deleteTechLead(String id);
    void updateTechLead(String id, TechLeadDTO techLeadDTO);
    TechLeadDTO getTechLeadbyID(String id);
}
