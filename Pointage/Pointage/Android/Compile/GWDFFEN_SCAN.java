/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_SCAN
 * Date : 06/02/2020 17:26:48
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.camera.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.media.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_SCAN extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_SCAN
////////////////////////////////////////////////////////////////////////////

/**
 * Cam
 */
class GWDCam extends WDChampCamera
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_SCAN.Cam
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307079810966536878l);

super.setChecksum("778832127");

super.setNom("Cam");

super.setType(24);

super.setBulle("");

super.setLibelle("");

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleurFond(0xFFFFFFFF);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(304, 391);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setParamDecodageCodeBarres(1, 0, 35);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -7.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Décodage d'un code-barres depuis Cam
 */
public void decodageCodeBarres(){setCallbackPCodeDecodage("fWD_decodageCodeBarres");}
public WDObjet fWD_decodageCodeBarres( WDObjet vWD_cb )
{
vWD_cb = WDParametre.traiterParametreClasse(vWD_cb, 1, false, WDCodeBarres.class, 111);


// SI ExtraitChaîne(cb.Contenu, 1, "<FNC1>") = sessionID ALORS
if(WDAPIChaine.extraitChaine(vWD_cb.getProp(EWDPropriete.PROP_CONTENU),1,new WDChaineU("<FNC1>")).opEgal(vWD_sessionID))
{
// 	requete est un restRequête
WDObjet vWD_requete = WDVarNonAllouee.ref;
vWD_requete = new WDInstance( new WDHTTPRequete() );


// 	requete..URL = "https://eventsio.mltstudio.tech/api/qr/" + cb.Contenu
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/qr/").opPlus(vWD_cb.getProp(EWDPropriete.PROP_CONTENU)));

// 	reponse est un restRéponse = RESTEnvoie(requete)
WDObjet vWD_reponse = WDVarNonAllouee.ref;
vWD_reponse = new WDInstance( new WDHTTPReponse() );

vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));


// 	SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 		Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 		donnees est un JSON = AnsiVersUnicode(reponse..Contenu)
WDObjet vWD_donnees = WDVarNonAllouee.ref;
vWD_donnees = new WDInstance( new WDJSON() );

vWD_donnees.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));


// 		Info(donnees)
WDAPIDialogue.info(vWD_donnees.getString());

}

}
else
{
// 	Info("Participation invalide")
WDAPIDialogue.info("Participation invalide");

}

return new WDVoid("fWD_decodageCodeBarres");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCam mWD_Cam;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_SCAN.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_SCAN
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_sessionID = WD_tabParam[0];
}
else { vWD_sessionID = null; erreurPassageParametreFenetre(WD_ntabParamLen, 1); }
super.ajouterVariableGlobale("sessionID",vWD_sessionID);

// Traitement du paramètre n°1
if(1<WD_ntabParamLen) 
{
vWD_eventID = WD_tabParam[1];
}
else { vWD_eventID = null; erreurPassageParametreFenetre(WD_ntabParamLen, 2); }
super.ajouterVariableGlobale("eventID",vWD_eventID);


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_sessionID = WDVarNonAllouee.ref;
 public WDObjet vWD_eventID = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_SCAN
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_Cam = new GWDCam();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_SCAN
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307079810966471342l);

super.setChecksum("783145656");

super.setNom("FEN_SCAN");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5CC);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Scanner un code-barres");

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


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_SCAN
////////////////////////////////////////////////////////////////////////////
mWD_Cam.initialiserObjet();
super.ajouter("Cam", mWD_Cam);
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
return GWDPEventsio.getInstance().mWD_FEN_SCAN;
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
