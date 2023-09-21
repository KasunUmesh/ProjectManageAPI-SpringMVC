package lk.ijse.gdse.repository;


import lk.ijse.gdse.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechLeadRepository extends JpaRepository<TechLead, String> {

    TechLead findTechLeadById(String id);
    void deleteById(String id);
}
