package routard;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import routard.Voyage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-22T18:53:59")
@StaticMetamodel(Depart.class)
public class Depart_ { 

    public static volatile SingularAttribute<Depart, String> ville;
    public static volatile SingularAttribute<Depart, String> jour;
    public static volatile SingularAttribute<Depart, Integer> prix;
    public static volatile SingularAttribute<Depart, Integer> voyageId;
    public static volatile SingularAttribute<Depart, Integer> id;
    public static volatile SingularAttribute<Depart, String> transport;
    public static volatile SingularAttribute<Depart, Voyage> voyage;

}