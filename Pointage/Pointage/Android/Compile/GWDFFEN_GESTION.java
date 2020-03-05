/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_GESTION
 * Date : 06/02/2020 17:26:48
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.json.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_GESTION extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_GESTION
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Evenement
 */
class GWDLIB_Evenement extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_GESTION.LIB_Evenement
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307798535095406915l);

super.setChecksum("785579993");

super.setNom("LIB_Evenement");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nom de l'événement");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 104);

super.setTailleInitiale(304, 54);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(5, 1000, 1000, 500, 200, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -9.000000, 0), 3, 0, 0x808080);

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
public GWDLIB_Evenement mWD_LIB_Evenement;

/**
 * LIB_Session
 */
class GWDLIB_Session extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_GESTION.LIB_Session
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307798535095537987l);

super.setChecksum("785711065");

super.setNom("LIB_Session");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Nom de la session");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(304, 66);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 1000, 1000, 500, 0, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -13.000000, 0), 3, 0, 0x808080);

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
public GWDLIB_Session mWD_LIB_Session;

/**
 * LIB_DateFin
 */
class GWDLIB_DateFin extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_GESTION.LIB_DateFin
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307798535095931218l);

super.setChecksum("786104296");

super.setNom("LIB_DateFin");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("DateFin");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(166, 272);

super.setTailleInitiale(146, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 650, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 3, 0, 0x808080);

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
public GWDLIB_DateFin mWD_LIB_DateFin;

/**
 * LIB_DateDebut
 */
class GWDLIB_DateDebut extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_GESTION.LIB_DateDebut
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3307798535096062290l);

super.setChecksum("786235368");

super.setNom("LIB_DateDebut");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("DateDebut");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 272);

super.setTailleInitiale(150, 22);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(5, 1000, 1000, 0, 650, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -7.000000, 0), 3, 0, 0x808080);

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
public GWDLIB_DateDebut mWD_LIB_DateDebut;

/**
 * LIB_Lieu
 */
class GWDLIB_Lieu extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_GESTION.LIB_Lieu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308184678422525192l);

super.setChecksum("783074000");

super.setNom("LIB_Lieu");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Lieu de l'événement");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 159);

super.setTailleInitiale(304, 54);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(5, 1000, 1000, 500, 350, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Barlow Semi Condensed Medium", -9.000000, 0), 3, 0, 0x808080);

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
public GWDLIB_Lieu mWD_LIB_Lieu;

/**
 * LIB_Au
 */
class GWDLIB_Au extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_GESTION.LIB_Au
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308186705650050788l);

super.setChecksum("786036356");

super.setNom("LIB_Au");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Au");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(166, 250);

super.setTailleInitiale(34, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(5, 1000, 1000, 500, 550, 0);

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
public GWDLIB_Au mWD_LIB_Au;

/**
 * LIB_Du
 */
class GWDLIB_Du extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_GESTION.LIB_Du
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308186821615178304l);

super.setChecksum("787046907");

super.setNom("LIB_Du");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Du");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 250);

super.setTailleInitiale(34, 21);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(5, 1000, 1000, 0, 550, 0);

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
public GWDLIB_Du mWD_LIB_Du;

/**
 * BTN_PRESENCE
 */
class GWDBTN_PRESENCE extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_GESTION.BTN_PRESENCE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308188947656793619l);

super.setChecksum("819851653");

super.setNom("BTN_PRESENCE");

super.setType(4);

super.setBulle("");

super.setLibelle("Présences");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 351);

super.setTailleInitiale(146, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(5, 1000, 1000, 0, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x666600, 10.000000, 10.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_PRESENCE
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_PRESENCE,sessionID,eventID)
WDAPIFenetre.ouvreFille(GWDPEventsio.getInstance().mWD_FEN_PRESENCE,new WDObjet[] {vWD_sessionID,vWD_eventID} );

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
public GWDBTN_PRESENCE mWD_BTN_PRESENCE;

/**
 * BTN_SCAN
 */
class GWDBTN_SCAN extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_GESTION.BTN_SCAN
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308188960542288815l);

super.setChecksum("820444964");

super.setNom("BTN_SCAN");

super.setType(4);

super.setBulle("");

super.setLibelle("Scanner");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(162, 351);

super.setTailleInitiale(150, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(5, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x8C8C19, 10.000000, 10.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x666600, 10.000000, 10.000000, 1, 1));

super.setImageFond("", 1, 0, 2, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SCAN
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_SCAN,sessionID,eventID)
WDAPIFenetre.ouvreFille(GWDPEventsio.getInstance().mWD_FEN_SCAN,new WDObjet[] {vWD_sessionID,vWD_eventID} );

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
public GWDBTN_SCAN mWD_BTN_SCAN;

/**
 * LIB_NbInscrits
 */
class GWDLIB_NbInscrits extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_GESTION.LIB_NbInscrits
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308190605519733766l);

super.setChecksum("825415474");

super.setNom("LIB_NbInscrits");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("NbInscrits");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 315);

super.setTailleInitiale(304, 21);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(5, 1000, 1000, 500, 800, 0);

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
public GWDLIB_NbInscrits mWD_LIB_NbInscrits;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_GESTION.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_GESTION
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


// requete est un restRequête
vWD_requete = new WDInstance( new WDHTTPRequete() );

super.ajouterVariableGlobale("requete",vWD_requete);



// requete..URL = "https://eventsio.mltstudio.tech/api/event/" + eventID + "/session/" + sessionID
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/event/").opPlus(vWD_eventID).opPlus("/session/").opPlus(vWD_sessionID));

// reponse est un restRéponse = RESTEnvoie(requete)
vWD_reponse = new WDInstance( new WDHTTPReponse() );

vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));

super.ajouterVariableGlobale("reponse",vWD_reponse);



// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	donnees est un JSON = AnsiVersUnicode(reponse..Contenu)
vWD_donnees = new WDInstance( new WDJSON() );

vWD_donnees.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));

super.ajouterVariableGlobale("donnees",vWD_donnees);



// 	LIB_Session..Valeur = donnees.name
mWD_LIB_Session.setValeur(vWD_donnees.get("name"));

// 	LIB_DateDebut..Valeur = donnees.start_at
mWD_LIB_DateDebut.setValeur(vWD_donnees.get("start_at"));

// 	LIB_DateFin..Valeur = donnees.end_at
mWD_LIB_DateFin.setValeur(vWD_donnees.get("end_at"));

}

// requete..URL = "https://eventsio.mltstudio.tech/api/event/" + eventID
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/event/").opPlus(vWD_eventID));

// reponse = RESTEnvoie(requete)
vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));

// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	donnees = AnsiVersUnicode(reponse..Contenu)
vWD_donnees.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));

// 	LIB_Evenement..Valeur = donnees.name
mWD_LIB_Evenement.setValeur(vWD_donnees.get("name"));

// 	LIB_Lieu..Valeur = donnees.location
mWD_LIB_Lieu.setValeur(vWD_donnees.get("location"));

}

// requete..URL = "https://eventsio.mltstudio.tech/api/event/" + eventID + "/session/" + sessionID + "/participations"
vWD_requete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://eventsio.mltstudio.tech/api/event/").opPlus(vWD_eventID).opPlus("/session/").opPlus(vWD_sessionID).opPlus("/participations"));

// reponse = RESTEnvoie(requete)
vWD_reponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_requete));

// SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 	Erreur(ErreurInfo(errComplet))
WDAPIDialogue.erreur(WDAPIVM.erreurInfo(19).getString());

}
else
{
// 	donnees = AnsiVersUnicode(reponse..Contenu)
vWD_donnees.setValeur(WDAPIChaine.ansiVersUnicode(vWD_reponse.getProp(EWDPropriete.PROP_CONTENU)));

// 	LIB_NbInscrits..Valeur = "Inscription(s) : " + donnees..Occurrence
mWD_LIB_NbInscrits.setValeur(new WDChaineU("Inscription(s) : ").opPlus(vWD_donnees.getProp(EWDPropriete.PROP_OCCURRENCE)));

}

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
 public WDObjet vWD_requete = WDVarNonAllouee.ref;
 public WDObjet vWD_reponse = WDVarNonAllouee.ref;
 public WDObjet vWD_donnees = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_GESTION
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Evenement = new GWDLIB_Evenement();
mWD_LIB_Session = new GWDLIB_Session();
mWD_LIB_DateFin = new GWDLIB_DateFin();
mWD_LIB_DateDebut = new GWDLIB_DateDebut();
mWD_LIB_Lieu = new GWDLIB_Lieu();
mWD_LIB_Au = new GWDLIB_Au();
mWD_LIB_Du = new GWDLIB_Du();
mWD_BTN_PRESENCE = new GWDBTN_PRESENCE();
mWD_BTN_SCAN = new GWDBTN_SCAN();
mWD_LIB_NbInscrits = new GWDLIB_NbInscrits();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_GESTION
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3307798135662044120l);

super.setChecksum("788564274");

super.setNom("FEN_GESTION");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5CC);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Gestion de la session");

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
// Initialisation des champs de FEN_GESTION
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Evenement.initialiserObjet();
super.ajouter("LIB_Evenement", mWD_LIB_Evenement);
mWD_LIB_Session.initialiserObjet();
super.ajouter("LIB_Session", mWD_LIB_Session);
mWD_LIB_DateFin.initialiserObjet();
super.ajouter("LIB_DateFin", mWD_LIB_DateFin);
mWD_LIB_DateDebut.initialiserObjet();
super.ajouter("LIB_DateDebut", mWD_LIB_DateDebut);
mWD_LIB_Lieu.initialiserObjet();
super.ajouter("LIB_Lieu", mWD_LIB_Lieu);
mWD_LIB_Au.initialiserObjet();
super.ajouter("LIB_Au", mWD_LIB_Au);
mWD_LIB_Du.initialiserObjet();
super.ajouter("LIB_Du", mWD_LIB_Du);
mWD_BTN_PRESENCE.initialiserObjet();
super.ajouter("BTN_PRESENCE", mWD_BTN_PRESENCE);
mWD_BTN_SCAN.initialiserObjet();
super.ajouter("BTN_SCAN", mWD_BTN_SCAN);
mWD_LIB_NbInscrits.initialiserObjet();
super.ajouter("LIB_NbInscrits", mWD_LIB_NbInscrits);
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
return GWDPEventsio.getInstance().mWD_FEN_GESTION;
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
