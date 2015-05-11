/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routard;

import RoutardDAO.ClientDAO;
import RoutardDAO.JpaUtil;
import Services.Service;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import util.Saisie;

/**
 *
 * @author kbulme
 */
public class Routard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Service s = new Service();
        JpaUtil.init();
        /*s.enregistrerClient("Mr","DUPOND","Jacques","2 Rue de la source 65210 Vanieux","jacques.dupond@wanadoo.fr","0586987452");
        s.enregistrerClient("Mr","DUPOND","Jacques","3 Rue de la source 65210 Vanieux","jacques.dupond@wanadoo.fr","0586987452");
        List<Client> listeC = s.listerLesClient();
        for (int i = 0; i<listeC.size();i++){
            //listeC.get(i).affichage();
        }
        List<Voyage> listeV = s.listerLesVoyage();
        for (int i = 0; i<listeV.size();i++){
            //listeV.get(i).affichage1();
        }
        Voyage v1 = listeV.get(0);
        Client c1 = listeC.get(0);
        List<Depart> listeD = v1.getDepart();
        for (int i = 0; i<listeD.size();i++){
            listeD.get(i).affichage();
        }
        Depart d1 = listeV.get(0).getDepart().get(0);
        s.creerDevis(4,c1,v1,d1);
        List<Devis> dListe = s.listerLesDevis(c1);
        s.afficherDevis(dListe.get(0), c1);
        List<Voyage> listeCircuit = s.listerLesCircuits();
        for (int i = 0; i<listeCircuit.size();i++){
            //listeCircuit.get(i).affichage();
        }
        List<Voyage> listeSejour = s.listerLesSejours();
        for (int i = 0; i<listeSejour.size();i++){
            //listeSejour.get(i).affichage();
        }*/
        Menu(s);
        
    }
    
    public static void Menu(Service s){
        Integer nombre = 0;
        List<Voyage> listeV;
        List<Conseiller> listeE;
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------IF'ROUTARD----------------------------------------------------------------");
        System.out.println("Bonjour, bienvenue sur l'application IF'Routard - Version Console 1.0");
        System.out.println("");
        System.out.println("Veuillez choisir une des options ci-dessous en saisissant au clavier le numéro associé puis en validant : ");
        System.out.println("**************************************************************************************************************");
        System.out.println("1. Création d'un client");
        System.out.println("2. Affichage de la liste des clients inscrits");
        System.out.println("3. Création d'un devis");
        System.out.println("4. Affichage d'un devis");
        System.out.println("5. Affichage de la liste des voyages proposés");
        System.out.println("6. Affichage de la liste des ciruits proposés");
        System.out.println("7. Affichage de la liste des séjours proposés");
        System.out.println("8. Affichage de la liste des conseillers");
        System.out.println("9. Quitter l'application");
        System.out.println("**************************************************************************************************************");
        nombre = Saisie.lireInteger("Que désirez-vous? ");
        switch(nombre){
            case 1 :
                InterfaceCreationClient(s);
                break;
            case 2 :
                System.out.println("");
                System.out.println("");
                System.out.println("Voici la liste des clients inscrits :");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                InterfaceAffichageClient(s);
                System.out.println("");
                Saisie.lireChaine("Pour revenir au menu, appuyez sur une touche");
                Menu(s);
                break;
            case 3 :
                InterfaceCreationDevis(s);
                break;
            case 4 :
                InterfaceAffichageDevis(s);
                break;
            case 5 :
                System.out.println("");
                System.out.println("");
                System.out.println("Voici la liste des voyages proposés :");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                listeV = s.listerLesVoyage();
                    for (int i = 0; i<listeV.size();i++){
                        listeV.get(i).affichage1();
                    }
                System.out.println("");
                System.out.println("");        
                Saisie.lireChaine("Appuyez sur une touche pour revenir au menu ");
                Menu(s);
                break;
            case 6 :
                System.out.println("");
                System.out.println("");
                System.out.println("Voici la liste des circuits proposés :");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                listeV = s.listerLesCircuits();
                    for (int i = 0; i<listeV.size();i++){
                        listeV.get(i).affichage1();
                        System.out.println("");
                        System.out.println("");
                    }
                System.out.println("");
                System.out.println("");        
                Saisie.lireChaine("Appuyez sur une touche pour revenir au menu ");
                Menu(s);
                break;
            case 7 :
                System.out.println("");
                System.out.println("");
                System.out.println("Voici la liste des séjours proposés :");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                listeV = s.listerLesSejours();
                    for (int i = 0; i<listeV.size();i++){
                        listeV.get(i).affichage1();
                        System.out.println("");
                        System.out.println("");
                    }
                System.out.println("");
                System.out.println("");        
                Saisie.lireChaine("Appuyez sur une touche pour revenir au menu ");
                Menu(s);
                break;
            case 8 : 
                System.out.println("");
                System.out.println("");
                System.out.println("Voici la liste des conseillers inscrits :");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                listeE = s.listerLesConseillers();
                    for (int i = 0; i<listeE.size();i++){
                        System.out.println((listeE.get(i)).getNom() + " " + (listeE.get(i)).getPrenom());
                    }
                System.out.println("");
                System.out.println("");        
                Saisie.lireChaine("Appuyez sur une touche pour revenir au menu ");
                Menu(s);
                break;
            case 9 :
                exit(0);
                break;
            default :
                nombre = Saisie.lireInteger("La valeur rentrée ne correspond pas à un numéro existant, merci de le ressaisir");
                Menu(s);
                break;
        }
    }
    
    private static void InterfaceCreationClient(Service s){
        String nom = "", prenom = "", civilite = "", adresse = "", mail = "", tph = "" , temp = "";
        System.out.println("");
        System.out.println("Bienvenue dans l'assistant de création d'un client");
        System.out.println("Merci de remplir le formulaire suivant :");
        civilite = Saisie.lireChaine("Civilité : ");
        nom = Saisie.lireChaine("Nom : ");
        prenom = Saisie.lireChaine("Prénom : ");
        adresse = Saisie.lireChaine("Adresse postale : ");
        mail = Saisie.lireChaine("Adresse e-mail : ");
        tph = Saisie.lireChaine("Numéro de téléphone : ");
        System.out.println("Vous vous apprétez à enregistrer " + civilite + " " + nom + " " + prenom + " domicilié au " + adresse + " joignable sur l'adresse e-mail: " + mail + " et au " +tph);
        temp = Saisie.lireChaine("Confirmez vous?(Oui/Non) ");
        System.out.println("");
        System.out.println("");
        System.out.println("Expediteur : ifroutard@monde.com");
        System.out.println("Pour : " + mail);
        System.out.println("Sujet : Bienvenue");
        if("Oui".equals(temp)){
            s.enregistrerClient(civilite, nom, prenom, adresse, mail, tph);
            List<Client> listeC = s.listerLesClient();
            Client c = listeC.get(listeC.size()-1);
            System.out.println("");
            System.out.println("Corps :");
            System.out.println("Bonjour " + prenom + ",");
            System.out.println("Nous vous confirmons votre inscription à l'agence IF'Routard. Votre numéro de client est : " + c.getId());
            System.out.println("");
            Saisie.lireChaine("Votre client a bien été créé, appuyez sur une touche pour revenir au menu ");
        }else if("Non".equals(temp)){
            System.out.println("");
            System.out.println("Corps :");
            System.out.println("Bonjour " + prenom + ",");
            System.out.println("Votre inscritpion à l'agence IF'Routard a échouée. Merci de recommencer ultérieurement");
            System.out.println("");
            Saisie.lireChaine("La création de votre client a été annulée, appuyez sur une touche pour revenir au menu ");
        }
        Menu(s);
    }

    private static void InterfaceAffichageClient(Service s) {
        List<Client> listeC = s.listerLesClient();
        for (int i = 0; i<listeC.size();i++){
            listeC.get(i).affichage();
        }
    }

    private static void InterfaceCreationDevis(Service s) {
        int temp1 = 0;
        int temp2 = 0;
        int nbPersonnes;
        Client c;
        Voyage v;
        Depart d;
        System.out.println("");
        System.out.println("Bienvenue dans l'assistant de création d'un devis");
        System.out.println("Merci de remplir le formulaire suivant");
        System.out.println("");
        System.out.println("----- Etape 1/4 : Choix du Client ------");
        System.out.println("");
        System.out.println("Voici la liste des clients enregistrés : ");
        System.out.println("");
        List<Client> listeC = s.listerLesClient();
        for (int i = 0; i<listeC.size();i++){
            System.out.print(i + ". ");
            listeC.get(i).affichage();
        }
        System.out.println("Veuillez choisir le client pour lequel vous voulez créé le devis");
        temp1 = Saisie.lireInteger("Saisissez le numéro : ");
        c = listeC.get(temp1);
        System.out.println("");
        System.out.println("");
        System.out.print("Vous avez choisi le client : ");
        c.affichage();
        System.out.println("");
        System.out.println("----- Etape 2/4 : Choix du Voyage ------");
        System.out.println("");
        System.out.println("Afin de choisir votre voyage, plusieurs choix s'offrent à vous : ");
        System.out.println("1. Choix par pays");
        System.out.println("2. Choix par type de voyage");
        System.out.println("3. Choix direct du voyage");
        temp2 = Saisie.lireInteger("Quelle option désirez vous ? ");
        v = choisirVoyage(s, temp2);
        System.out.println("");
        System.out.println("");
        System.out.print("Vous avez choisi le voyage : ");
        v.affichage();
        System.out.println("");
        System.out.println("----- Etape 3/4 : Choix du Depart ------");
        System.out.println("");
        List<Depart> listeD = v.getDepart();
        for (int i = 0; i<listeD.size();i++){
            System.out.print(i + ". ");
            listeD.get(i).affichage();
        }
        temp1 = Saisie.lireInteger("Saisissez le numéro du depart souhaité : ");
        d = listeD.get(temp1);
        System.out.println("");
        System.out.println("");
        System.out.print("Vous avez choisi le depart : ");
        d.affichage();
        System.out.println("");
        System.out.println("----- Etape 4/4 : Choix du Nombre de Personnes ------");
        System.out.println("");
        temp2 = Saisie.lireInteger("Saisissez le nombre de personnes souhaité : ");
        nbPersonnes = temp2;
        System.out.println("");
        System.out.println("");
        System.out.print("Vous avez choisi " + nbPersonnes + " personnes");
        s.creerDevis(nbPersonnes, c, v, d);
        System.out.println("");
        Saisie.lireChaine("Votre devis a bien été créé, appuyez sur une touche pour revenir au menu ");
        Menu(s);
    }
    
    private static Voyage choisirVoyage(Service s, int t){
        int temp;
        Voyage v = new Voyage();
        Pays p;
        List<Voyage> listeV = new ArrayList<Voyage>();
        switch(t){
            case 1 :
                System.out.println("");
                System.out.println("Voici les pays disponibles : ");
                List<Pays> listeP = s.listerLesPays();
                for (int i = 0; i<listeP.size();i++){
                    System.out.print(i + ". ");
                    listeP.get(i).affichage();
                }
                temp = Saisie.lireInteger("Saisissez le numéro : ");
        p = listeP.get(temp);
        System.out.println("Voici les voyages disponibles pour le pays : " + p.getNom());
        listeV = s.listerLesVoyagePays(p);
                for (int i = 0; i<listeV.size();i++){
                    System.out.print(i + ". " );
                    listeV.get(i).affichage1();
                    System.out.println("");
                    System.out.println("");
                }
                temp = Saisie.lireInteger("Saisissez le numéro : ");
                v = listeV.get(temp);
                break;
            case 2 :
                System.out.println("");
                System.out.println("Il y a deux types de voyages disponibles :");
                System.out.println("1. Circuit");
                System.out.println("2. Sejour");
                temp = Saisie.lireInteger("Saisissez le numéro du voyage souhaité : ");
                if(temp == 1){
                    listeV = s.listerLesCircuits();
                    for (int i = 0; i<listeV.size();i++){
                        System.out.println(i + ". ");
                        listeV.get(i).affichage1();
                        System.out.println("");
                        System.out.println("");
                    }
                }else{
                    listeV = s.listerLesSejours();
                    for (int i = 0; i<listeV.size();i++){
                        System.out.println(i + ". ");
                        listeV.get(i).affichage1();
                        System.out.println("");
                        System.out.println("");
                    }
                }
                temp = Saisie.lireInteger("Saisissez le numéro du voyage souhaité : ");
                v = listeV.get(temp);
                break;
            case 3 :
                System.out.println("");
                listeV = s.listerLesVoyage();
                    for (int i = 0; i<listeV.size();i++){
                        System.out.println(i + ". ");
                        listeV.get(i).affichage1();
                        System.out.println("");
                        System.out.println("");
                    }
                temp = Saisie.lireInteger("Saisissez le numéro du voyage souhaité : ");
                v = listeV.get(temp);
                break; 
        }
        return v;
    }

    private static void InterfaceAffichageDevis(Service s) {
        int temp1;
        Client c;
        Devis d;
        System.out.println("");
        System.out.println("Pour afficher un devis vous devez tout d'abord selectionner un client dans la liste suivante :");
        List<Client> listeC = s.listerLesClient();
        for (int i = 0; i<listeC.size();i++){
            System.out.print(i + ". ");
            listeC.get(i).affichage();
        }
        System.out.println("");
        System.out.println("Veuillez choisir le client pour lequel vous voulez afficher le devis");
        temp1 = Saisie.lireInteger("Saisissez le numéro : ");
        c = listeC.get(temp1);
        System.out.println("");
        System.out.println("");
        System.out.print("Vous avez choisi le client : ");
        c.affichage();
        System.out.println("");
        System.out.println("");
        System.out.println("Il vous faut désormais choisir un devis dans la liste suivante :");
        List<Devis> lDevis = s.listerLesDevis(c);
        for (int i = 0; i<lDevis.size();i++){
            System.out.println(i + ". " + (lDevis.get(i)).getDate());
        }
        System.out.println("");
        System.out.println("Veuillez choisir le devis à afficher");
        temp1 = Saisie.lireInteger("Saisissez le numéro : ");
        d = lDevis.get(temp1);
        System.out.println("Voilà l'affichage du devis : ");
        System.out.println("");
        s.afficherDevis(d, c);
        System.out.println("");
        System.out.println("");        
        Saisie.lireChaine("Appuyez sur une touche pour revenir au menu ");
        Menu(s);
    }
}