package routard;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import routard.Conseiller;
import routard.Depart;
import routard.Voyage;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-22T18:02:30")
@StaticMetamodel(Devis.class)
public class Devis_ { 

    public static volatile SingularAttribute<Devis, String> date;
    public static volatile SingularAttribute<Devis, Integer> id;
    public static volatile SingularAttribute<Devis, Voyage> voyageDuDevis;
    public static volatile SingularAttribute<Devis, Integer> nbPersonnes;
    public static volatile SingularAttribute<Devis, Integer> prixTotal;
    public static volatile SingularAttribute<Devis, Conseiller> conseillerDuDevis;
    public static volatile SingularAttribute<Devis, Depart> departDuDevis;

}