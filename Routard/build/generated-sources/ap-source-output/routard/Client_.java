package routard;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import routard.Devis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-22T18:02:30")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> adresseMail;
    public static volatile SingularAttribute<Client, Integer> id;
    public static volatile SingularAttribute<Client, String> noTel;
    public static volatile SingularAttribute<Client, String> adressePhysique;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SingularAttribute<Client, String> civilite;
    public static volatile ListAttribute<Client, Devis> devis;

}