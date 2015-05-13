package routard;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import routard.Depart;
import routard.Pays;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-13T09:31:20")
@StaticMetamodel(Voyage.class)
public class Voyage_ { 

    public static volatile SingularAttribute<Voyage, String> code;
    public static volatile ListAttribute<Voyage, Pays> paysVoyage;
    public static volatile SingularAttribute<Voyage, String> dtype;
    public static volatile SingularAttribute<Voyage, String> description;
    public static volatile SingularAttribute<Voyage, Integer> duree;
    public static volatile SingularAttribute<Voyage, Integer> id;
    public static volatile ListAttribute<Voyage, Depart> depart;
    public static volatile SingularAttribute<Voyage, String> nom;

}