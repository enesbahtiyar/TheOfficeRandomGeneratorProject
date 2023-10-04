package eb.TheOfficeRandomGenerator.repository;

import eb.TheOfficeRandomGenerator.entity.Episodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodesRepository extends JpaRepository<Episodes, Long>
{
}
