package routard;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import routard.Devis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T14:24:19")
@StaticMetamodel(Conseiller.class)
public class Conseiller_ { 

    public static volatile SingularAttribute<Conseiller, Integer> id;
    public static volatile ListAttribute<Conseiller, Devis> devisConseiller;
    public static volatile SingularAttribute<Conseiller, String> nom;
    public static volatile SingularAttribute<Conseiller, String> prenom;
    public static volatile SingularAttribute<Conseiller, String> email;

}