/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_PRESENCE
 * Date : 06/02/2020 17:26:48
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.pulltorefresh.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_PRESENCE extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_PRESENCE
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Invitations
 */
class GWDZR_Invitations extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_PRESENCE.ZR_Invitations
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Nom
 */
class GWDLIB_Nom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_PRESENCE.ZR_Invitations.LIB_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3331573373837041032l);

super.setChecksum("821101365");

super.setNom("LIB_Nom");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nom de l'invité");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 19);

super.setTailleInitiale(135, 29);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(5, 1000, 1000, 0, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -11.000000, 0), 3, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0E0E0, 0x808080, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDLIB_Nom mWD_LIB_Nom = new GWDLIB_Nom();

/**
 * INT_Presence
 */
class GWDINT_Presence extends WDInterrupteurABascule
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_PRESENCE.ZR_Invitations.INT_Presence
////////////////////////////////////////////////////////////////////////////
/**
 * Initialise tous les champs de FEN_PRESENCE.ZR_Invitations.INT_Presence
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_PRESENCE.ZR_Invitations.INT_Presence
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
// Erreur d'initialisation du champ
// Erreur d'initialisation du champ
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3331573373837106568l);

super.setChecksum("821225725");

super.setNom("INT_Presence");

super.setType(132);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(4);

super.setPositionInitiale(283, 23);

super.setTailleInitiale(22, 22);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 1000, 1000, 1000, 500, 0);

super.setNumTab(-1);

super.setLettreAppel(0);

super.setTauxParallaxe(0, 0);

super.setModeAffichage(4, 0, false);

super.setOptionOnOff("", "1", "", "0");

super.setStyleGlissiere("", WDCadreFactory.creerCadre_GEN(27, 0x8000, 0xFF00, 0xFF00, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x8000, 0xFF00, 0xFF00, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x8000, 0xFF00, 0xFF00, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x8000, 0xFF00, 0xFF00, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x8000, 0xFF00, 0xFF00, 16.000000, 16.000000, 1, 1), "", WDCadreFactory.creerCadre_GEN(27, 0x80, 0xFF, 0xFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x80, 0xFF, 0xFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x80, 0xFF, 0xFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x80, 0xFF, 0xFF, 16.000000, 16.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0x80, 0xFF, 0xFF, 16.000000, 16.000000, 1, 1), 0, 0, 20, 20, 0);

super.setStyleCurseur("", WDCadreFactory.creerCadre_GEN(27, 0xFF00, 0x7F00, 0xFF00, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF00, 0x7F00, 0xFF00, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF00, 0x7F00, 0xFF00, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF00, 0x7F00, 0xFF00, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF00, 0x7F00, 0xFF00, 12.000000, 12.000000, 1, 1), "", WDCadreFactory.creerCadre_GEN(27, 0xFF, 0x7F, 0xFF, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF, 0x7F, 0xFF, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF, 0x7F, 0xFF, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF, 0x7F, 0xFF, 12.000000, 12.000000, 1, 1), WDCadreFactory.creerCadre_GEN(27, 0xFF, 0x7F, 0xFF, 12.000000, 12.000000, 1, 1), 20, 20, 0);

super.setStyleLibelleOn(0x0, 0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -11.000000, 0));

super.setStyleLibelleOff(0x0, 0x808080, creerPolice_GEN("MS Shell Dlg", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
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
public GWDINT_Presence mWD_INT_Presence = new GWDINT_Presence();
/**
 * Initialise tous les champs de FEN_PRESENCE.ZR_Invitations
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_PRESENCE.ZR_Invitations
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Nom.initialiserObjet();
super.ajouterChamp("LIB_Nom",mWD_LIB_Nom);
mWD_INT_Presence.initialiserObjet();
super.ajouterChamp("INT_Presence",mWD_INT_Presence);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(2,2,316,64);
super.setQuid(3331573373836975496l);

super.setChecksum("821048141");

super.setNom("ZR_Invitations");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 0, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(5);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 313, 64);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -7.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(true, 0x0);

super.setStyleSeparateurHorizontaux(1, 0x0);

super.setDessinerLigneVide(false);

super.setPullToRefresh("", 0xE5E5CC);

super.setCouleurCellule(0xE5E5CC, 0xE5E5CC, 0xF5800000, 0xF5000000, 0xFFFFFFFF);

super.setImagePlusMoins("");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Rafraîchissement par tirer/relâcher de ZR_Invitations
 */
public WDObjet raffraichissementPTR()
{
super.raffraichissementPTR();

// LoadPresences()
fWD_loadPresences();

return new WDVoid("raffraichissementPTR");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_Invitations mWD_ZR_Invitations;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_PRESENCE
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  LoadPresences ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_loadPresences()
{
initExecProcLocale("LoadPresences");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_requete = WDVarNonAllouee.ref;
WDObjet vWD_reponse = WDVarNonAllouee.ref;


// requete est un restRequête
vWD_requete = new WDInstance( new WDHTTPRequete() );


// requete..URL = "https://eventsio.mltstudio.tech/api/event/" + eventID + "/session/" + sessionID + "/participations"
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/event/").opPlus(vWD_eventID).opPlus("/session/").opPlus(vWD_sessionID).opPlus("/participations"));

// reponse est un restRéponse = RESTEnvoie(requete)
vWD_reponse = new WDInstance( new WDHTTPReponse() );

vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));


// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	donnees est un JSON = AnsiVersUnicode(reponse..Contenu)
WDObjet vWD_donnees = WDVarNonAllouee.ref;
vWD_donnees = new WDInstance( new WDJSON() );

vWD_donnees.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));


// 	POUR i=1 _À_ donnees..Occurrence
// Délimiteur de visibilité pour ne pas étendre la visibilité des variables temporaires _WDExpBorneMax et _WDExpPas
{
WDObjet _WDExpBorneMax0 = new WDEntier4(vWD_donnees.getProp(EWDPropriete.PROP_OCCURRENCE));
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(_WDExpBorneMax0);vWD_i.opInc())
{
// 		requete..URL = "https://eventsio.mltstudio.tech/api/event/" + eventID + "/session/" + sessionID + "/participation/" + donnees[i].id
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/event/").opPlus(vWD_eventID).opPlus("/session/").opPlus(vWD_sessionID).opPlus("/participation/").opPlus(vWD_donnees.get(vWD_i).get("id")));

// 		reponse = RESTEnvoie(requete)
vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));

// 		SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 			Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 			datas est un JSON = AnsiVersUnicode(reponse..Contenu)
WDObjet vWD_datas = WDVarNonAllouee.ref;
vWD_datas = new WDInstance( new WDJSON() );

vWD_datas.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));


// 			ZR_Invitations.Ajoute()
WDAPIZoneRepetee.zoneRepeteeAjoute(mWD_ZR_Invitations);

// 			ZR_Invitations[ZR_Invitations..Occurrence].LIB_Nom..Valeur = datas.name
mWD_ZR_Invitations.get(mWD_ZR_Invitations.getProp(EWDPropriete.PROP_OCCURRENCE)).get("LIB_Nom").setValeur(vWD_datas.get("name"));

// 			SI donnees[i].flashed_at <> 0 ALORS
if(vWD_donnees.get(vWD_i).get("flashed_at").opDiff(0))
{
// 				ZR_Invitations[ZR_Invitations..Occurrence].INT_Presence..Valeur = 1
mWD_ZR_Invitations.get(mWD_ZR_Invitations.getProp(EWDPropriete.PROP_OCCURRENCE)).get("INT_Presence").setValeur(1);

}

}

}
}

}

}
finally
{
finExecProcLocale();
}

}




/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_PRESENCE.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_PRESENCE
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


// LoadPresences()
fWD_loadPresences();

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
// Création des champs de la fenêtre FEN_PRESENCE
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Invitations = new GWDZR_Invitations();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_PRESENCE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3331573373836909960l);

super.setChecksum("825358934");

super.setNom("FEN_PRESENCE");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5CC);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Présences");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0x0);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_PRESENCE
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Invitations.initialiserObjet();
super.ajouter("ZR_Invitations", mWD_ZR_Invitations);
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
return false;
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
return GWDPEventsio.getInstance().mWD_FEN_PRESENCE;
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
