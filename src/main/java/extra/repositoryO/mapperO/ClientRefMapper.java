package extra.repositoryO.mapperO;

import extra.repositoryO.dtoO.ClientRefDTO;
import extra.repositoryO.entityO.ClientRef;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public abstract class ClientRefMapper extends ModelMapper {

    PropertyMap<ClientRef, ClientRefDTO> orderMap = new PropertyMap<ClientRef, ClientRefDTO>() {
        protected void configure() {
            map().setCompanyDomain(source.getCompanyDomain());
            map().setDate(source.getDate());
            map().setDomain(source.getDomain());

        }


    };

    public PropertyMap<ClientRef, ClientRefDTO> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(PropertyMap<ClientRef, ClientRefDTO> orderMap) {
        this.orderMap = orderMap;
    }


}
