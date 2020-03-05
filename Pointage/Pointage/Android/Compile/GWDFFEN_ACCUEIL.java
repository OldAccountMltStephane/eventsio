/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_ACCUEIL
 * Date : 06/02/2020 17:26:48
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_ACCUEIL extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_ACCUEIL
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Email
 */
class GWDSAI_Email extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ACCUEIL.SAI_Email
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,253,32);
super.setRectCompPrincipal(0,32,253,32);
super.setQuid(3307436838719402116l);

super.setChecksum("785355868");

super.setNom("SAI_Email");

super.setType(20001);

super.setBulle("");

super.setLibelle("Email");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(32, 8);

super.setTailleInitiale(253, 66);

super.setValeurInitiale("email@email.net");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(5, 1000, 1000, 500, 0, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x808080, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xF4000000, 0x0, 0xF4800000, 5.000000, 5.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xFF8000, 0xFF8000, 0xFF8000, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Email mWD_SAI_Email;

/**
 * BTN_Connexion
 */
class GWDBTN_Connexion extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_ACCUEIL.BTN_Connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307437491556876696l);

super.setChecksum("787802520");

super.setNom("BTN_Connexion");

super.setType(4);

super.setBulle("");

super.setLibelle("Se connecter");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(78, 166);

super.setTailleInitiale(160, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(1);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x666600, 10.000000, 10.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Connexion
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_requete = WDVarNonAllouee.ref;


// requete est un restRequête
vWD_requete = new WDInstance( new WDHTTPRequete() );


// SI SAI_Email <> "" ALORS
if(mWD_SAI_Email.opDiff(""))
{
// 	SI SAI_Mot_de_passe <> "" ALORS
if(mWD_SAI_Mot_de_passe.opDiff(""))
{
// 		requete..URL = "https://eventsio.mltstudio.tech/api/auth/" + SAI_Email + "/" + SAI_Mot_de_passe
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/auth/").opPlus(mWD_SAI_Email).opPlus("/").opPlus(mWD_SAI_Mot_de_passe));

// 		reponse est un restRéponse = RESTEnvoie(requete)
WDObjet vWD_reponse = WDVarNonAllouee.ref;
vWD_reponse = new WDInstance( new WDHTTPReponse() );

vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));


// 		SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 			Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 			donnees est un JSON = AnsiVersUnicode(reponse..Contenu)
WDObjet vWD_donnees = WDVarNonAllouee.ref;
vWD_donnees = new WDInstance( new WDJSON() );

vWD_donnees.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));


// 			SI Left(donnees,1) = "{" ALORS
if(WDAPIChaine.gauche(vWD_donnees,1).opEgal("{"))
{
// 				OuvreFenêtreMobile(FEN_SESSIONS, donnees.id)
WDAPIFenetre.ouvreFille(GWDPEventsio.getInstance().mWD_FEN_SESSIONS,new WDObjet[] {vWD_donnees.get("id")} );

}
else
{
// 				Info(donnees)
WDAPIDialogue.info(vWD_donnees.getString());

}

}

}
else
{
// 		Info("Veuillez indiquer un mot de passe")
WDAPIDialogue.info("Veuillez indiquer un mot de passe");

}

}
else
{
// 	Info("Veuillez indiquer un email")
WDAPIDialogue.info("Veuillez indiquer un email");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Connexion mWD_BTN_Connexion;

/**
 * SAI_Mot_de_passe
 */
class GWDSAI_Mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_ACCUEIL.SAI_Mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,253,32);
super.setRectCompPrincipal(0,32,253,32);
super.setQuid(3308188415073516408l);

super.setChecksum("812518197");

super.setNom("SAI_Mot_de_passe");

super.setType(20001);

super.setBulle("");

super.setLibelle("Mot de passe");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(32, 82);

super.setTailleInitiale(253, 66);

super.setValeurInitiale("123456789");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 200, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(0);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x0, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 3, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x808080, 0x0, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xF4000000, 0x0, 0xF4800000, 5.000000, 5.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("MS Shell Dlg", -11.000000, 0));

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xFF8000, 0xFF8000, 0xFF8000, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Mot_de_passe mWD_SAI_Mot_de_passe;

/**
 * BTN_Inscription
 */
class GWDBTN_Inscription extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_ACCUEIL.BTN_Inscription
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3329321668479326184l);

super.setChecksum("787267443");

super.setNom("BTN_Inscription");

super.setType(4);

super.setBulle("");

super.setLibelle("S'inscrire");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(78, 281);

super.setTailleInitiale(160, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(5, 1000, 1000, 500, 800, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x666600, 10.000000, 10.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Inscription
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// LanceAppliAssociée("https://eventsio.mltstudio.tech/register")
WDAPIDiversSTD.lanceAppliAssociee("https://eventsio.mltstudio.tech/register");

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Inscription mWD_BTN_Inscription;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ACCUEIL.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFF000001, 0x8C8C19, true);

super.setImageFond("");

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_ACCUEIL
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_ACCUEIL
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_Email = new GWDSAI_Email();
mWD_BTN_Connexion = new GWDBTN_Connexion();
mWD_SAI_Mot_de_passe = new GWDSAI_Mot_de_passe();
mWD_BTN_Inscription = new GWDBTN_Inscription();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_ACCUEIL
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307079587627530064l);

super.setChecksum("782503718");

super.setNom("FEN_ACCUEIL");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5CC);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Connectez-vous");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(2);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0x0);

super.setModeClavierCompat22();


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ACCUEIL
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Email.initialiserObjet();
super.ajouter("SAI_Email", mWD_SAI_Email);
mWD_BTN_Connexion.initialiserObjet();
super.ajouter("BTN_Connexion", mWD_BTN_Connexion);
mWD_SAI_Mot_de_passe.initialiserObjet();
super.ajouter("SAI_Mot_de_passe", mWD_SAI_Mot_de_passe);
mWD_BTN_Inscription.initialiserObjet();
super.ajouter("BTN_Inscription", mWD_BTN_Inscription);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPEventsio.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPEventsio.getInstance();
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPEventsio.getInstance().mWD_FEN_ACCUEIL;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "";
}
}
