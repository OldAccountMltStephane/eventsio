/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_SESSIONS
 * Date : 06/02/2020 17:38:29
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.pulltorefresh.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_SESSIONS extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_SESSIONS
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_Sessions
 */
class GWDZR_Sessions extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_SESSIONS.ZR_Sessions
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_IDSESSION
 */
class GWDATT_IDSESSION extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_SESSIONS.ZR_Sessions.ATT_IDSESSION
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IDSESSION");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_SESSIONS.ZR_Sessions.ATT_IDSESSION

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_IDSESSION mWD_ATT_IDSESSION = new GWDATT_IDSESSION();

/**
 * ATT_IDEVENT
 */
class GWDATT_IDEVENT extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_SESSIONS.ZR_Sessions.ATT_IDEVENT
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IDEVENT");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_SESSIONS.ZR_Sessions.ATT_IDEVENT

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_IDEVENT mWD_ATT_IDEVENT = new GWDATT_IDEVENT();

/**
 * BTN_CodeBarre
 */
class GWDBTN_CodeBarre extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_SESSIONS.ZR_Sessions.BTN_CodeBarre
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307810646926448523l);

super.setChecksum("808850157");

super.setNom("BTN_CodeBarre");

super.setType(4);

super.setBulle("");

super.setLibelle("Code-barres");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(216, 51);

super.setTailleInitiale(89, 39);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(5, 0, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x666600, 10.000000, 10.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_CodeBarre ( ZR_Sessions )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_CODEBARRES,ZR_Sessions.ATT_IDSESSION, userID)
WDAPIFenetre.ouvreFille(GWDPEventsio.getInstance().mWD_FEN_CODEBARRES,new WDObjet[] {mWD_ATT_IDSESSION,vWD_userID} );

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
public GWDBTN_CodeBarre mWD_BTN_CodeBarre = new GWDBTN_CodeBarre();

/**
 * BTN_Session
 */
class GWDBTN_Session extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_SESSIONS.ZR_Sessions.BTN_Session
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307810646926514059l);

super.setChecksum("808915693");

super.setNom("BTN_Session");

super.setType(4);

super.setBulle("");

super.setLibelle("Informations");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(216, 6);

super.setTailleInitiale(89, 41);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 0, 1000, 1000, 0, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x666600, 10.000000, 10.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Session ( ZR_Sessions )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_GESTION,ZR_Sessions.ATT_IDSESSION,ZR_Sessions.ATT_IDEVENT)
WDAPIFenetre.ouvreFille(GWDPEventsio.getInstance().mWD_FEN_GESTION,new WDObjet[] {mWD_ATT_IDSESSION,mWD_ATT_IDEVENT} );

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
public GWDBTN_Session mWD_BTN_Session = new GWDBTN_Session();

/**
 * LIB_Session
 */
class GWDLIB_Session extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_SESSIONS.ZR_Sessions.LIB_Session
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307810646926579595l);

super.setChecksum("808980773");

super.setNom("LIB_Session");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nom de la session");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 6);

super.setTailleInitiale(209, 46);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 0, 0, 0);

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
public GWDLIB_Session mWD_LIB_Session = new GWDLIB_Session();

/**
 * LIB_Evenement
 */
class GWDLIB_Evenement extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_SESSIONS.ZR_Sessions.LIB_Evenement
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307810646926776203l);

super.setChecksum("809177381");

super.setNom("LIB_Evenement");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nom de l'événement");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 48);

super.setTailleInitiale(209, 51);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(5, 1000, 1000, 0, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -8.000000, 0), 3, 0, 0x808080);

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
public GWDLIB_Evenement mWD_LIB_Evenement = new GWDLIB_Evenement();
/**
 * Initialise tous les champs de FEN_SESSIONS.ZR_Sessions
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_SESSIONS.ZR_Sessions
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_IDSESSION.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_IDSESSION);
mWD_ATT_IDEVENT.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_IDEVENT);
mWD_BTN_CodeBarre.initialiserObjet();
super.ajouterChamp("BTN_CodeBarre",mWD_BTN_CodeBarre);
mWD_BTN_Session.initialiserObjet();
super.ajouterChamp("BTN_Session",mWD_BTN_Session);
mWD_LIB_Session.initialiserObjet();
super.ajouterChamp("LIB_Session",mWD_LIB_Session);
mWD_LIB_Evenement.initialiserObjet();
super.ajouterChamp("LIB_Evenement",mWD_LIB_Evenement);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(2,2,313,96);
super.setQuid(3307810646926382987l);

super.setChecksum("808796477");

super.setNom("ZR_Sessions");

super.setType(30);

super.setBulle("");

super.setLibelle("Mes sessions");

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

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(5);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 313, 96);

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
 * Traitement: Sélection d'une ligne de ZR_Sessions
 */
public void selectionLigne()
{
super.selectionLigne();

// OuvreFenêtreMobile(FEN_CODEBARRES,ZR_Sessions.ATT_IDSESSION, userID )
WDAPIFenetre.ouvreFille(GWDPEventsio.getInstance().mWD_FEN_CODEBARRES,new WDObjet[] {mWD_ATT_IDSESSION,vWD_userID} );

}




/**
 * Traitement: Rafraîchissement par tirer/relâcher de ZR_Sessions
 */
public WDObjet raffraichissementPTR()
{
super.raffraichissementPTR();

// ZR_Sessions.SupprimeTout()
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(this);

// LoadSessions()
fWD_loadSessions();

return new WDVoid("raffraichissementPTR");
}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_Sessions mWD_ZR_Sessions;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_SESSIONS
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  LoadSessions ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_loadSessions()
{
initExecProcLocale("LoadSessions");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_requete = WDVarNonAllouee.ref;
WDObjet vWD_reponse = WDVarNonAllouee.ref;


// 	requete est un restRequête
vWD_requete = new WDInstance( new WDHTTPRequete() );


// 	requete..URL = "https://eventsio.mltstudio.tech/api/user/" + userID + "/participations"
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/user/").opPlus(vWD_userID).opPlus("/participations"));

// 	reponse est un restRéponse = RESTEnvoie(requete)
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


// 		POUR i=1 _À_ donnees..Occurrence
// Délimiteur de visibilité pour ne pas étendre la visibilité des variables temporaires _WDExpBorneMax et _WDExpPas
{
WDObjet _WDExpBorneMax0 = new WDEntier4(vWD_donnees.getProp(EWDPropriete.PROP_OCCURRENCE));
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(_WDExpBorneMax0);vWD_i.opInc())
{
// 			requete..URL = "https://eventsio.mltstudio.tech/api/session/" + donnees[i].id
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/session/").opPlus(vWD_donnees.get(vWD_i).get("id")));

// 			reponse = RESTEnvoie(requete)
vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));

// 			SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 				Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 				datas est un JSON = AnsiVersUnicode(reponse..Contenu)
WDObjet vWD_datas = WDVarNonAllouee.ref;
vWD_datas = new WDInstance( new WDJSON() );

vWD_datas.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));


// 				ZR_Sessions.Ajoute()
WDAPIZoneRepetee.zoneRepeteeAjoute(mWD_ZR_Sessions);

// 				ZR_Sessions[ZR_Sessions..Occurrence].LIB_Session..Valeur = datas.name
mWD_ZR_Sessions.get(mWD_ZR_Sessions.getProp(EWDPropriete.PROP_OCCURRENCE)).get("LIB_Session").setValeur(vWD_datas.get("name"));

// 				ZR_Sessions[ZR_Sessions..Occurrence].ATT_IDSESSION = datas.id
mWD_ZR_Sessions.get(mWD_ZR_Sessions.getProp(EWDPropriete.PROP_OCCURRENCE)).get("ATT_IDSESSION").setValeur(vWD_datas.get("id"));

// 				ZR_Sessions[ZR_Sessions..Occurrence].ATT_IDEVENT = datas.evenement_id
mWD_ZR_Sessions.get(mWD_ZR_Sessions.getProp(EWDPropriete.PROP_OCCURRENCE)).get("ATT_IDEVENT").setValeur(vWD_datas.get("evenement_id"));

// 				requete..URL = "https://eventsio.mltstudio.tech/api/event/" + datas.evenement_id
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/event/").opPlus(vWD_datas.get("evenement_id")));

}

// 			reponse = RESTEnvoie(requete)
vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));

// 			SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 				Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 				infos est un JSON = AnsiVersUnicode(reponse..Contenu)
WDObjet vWD_infos = WDVarNonAllouee.ref;
vWD_infos = new WDInstance( new WDJSON() );

vWD_infos.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));


// 				ZR_Sessions[ZR_Sessions..Occurrence].LIB_Evenement..Valeur = infos.name
mWD_ZR_Sessions.get(mWD_ZR_Sessions.getProp(EWDPropriete.PROP_OCCURRENCE)).get("LIB_Evenement").setValeur(vWD_infos.get("name"));

// 				SI infos.user_id <> userID ALORS
if(vWD_infos.get("user_id").opDiff(vWD_userID))
{
// 					BTN_Session..Visible = Faux
mWD_ZR_Sessions.mWD_BTN_Session.setProp(EWDPropriete.PROP_VISIBLE,false);

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
// Déclaration des champs du fils n°1 de FEN_SESSIONS.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_SESSIONS
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_userID = WD_tabParam[0];
}
else { vWD_userID = null; erreurPassageParametreFenetre(WD_ntabParamLen, 1); }
super.ajouterVariableGlobale("userID",vWD_userID);


// LoadSessions()
fWD_loadSessions();

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_userID = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_SESSIONS
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_Sessions = new GWDZR_Sessions();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_SESSIONS
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307810646926317451l);

super.setChecksum("813107270");

super.setNom("FEN_SESSIONS");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5CC);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Mes sessions");

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
// Initialisation des champs de FEN_SESSIONS
////////////////////////////////////////////////////////////////////////////
mWD_ZR_Sessions.initialiserObjet();
super.ajouter("ZR_Sessions", mWD_ZR_Sessions);
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
return GWDPEventsio.getInstance().mWD_FEN_SESSIONS;
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
