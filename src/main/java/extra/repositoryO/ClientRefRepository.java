package extra.repositoryO;

import extra.repositoryO.entityO.ClientRef;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRefRepository extends PagingAndSortingRepository<ClientRef, Long> {

    List<ClientRef> findAll();

}
