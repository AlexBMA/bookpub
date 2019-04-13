package extra.repositoryO.entityO;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client_ref")
@Getter
@Setter
public class ClientRef {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "company_domain")
    private String companyDomain;

    @Column(name = "creation_date")
    private Date date;

    @Column(name = "active")
    private int isActive;

    @Column(name = "domain")
    private String domain;

}
