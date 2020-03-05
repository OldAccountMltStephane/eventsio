/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_CODEBARRES
 * Date : 06/02/2020 17:26:48
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.barcode.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_CODEBARRES extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_CODEBARRES
////////////////////////////////////////////////////////////////////////////

/**
 * CBA
 */
class GWDCBA extends WDChampCodeBarres
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_CODEBARRES.CBA
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3308189557546420247l);

super.setChecksum("824132423");

super.setNom("CBA");

super.setType(26);

super.setBulle("");

super.setLibelle("Code-Barres");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(8, 85);

super.setTailleInitiale(304, 222);

super.setValeurInitiale("0123456789");

super.setPlan(0);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setTauxParallaxe(0, 0);

super.setParamCodeBarres(5, 0x3002000, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("MS Shell Dlg", -7.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDCBA mWD_CBA;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_CODEBARRES.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_CODEBARRES
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
vWD_userID = WD_tabParam[1];
}
else { vWD_userID = null; erreurPassageParametreFenetre(WD_ntabParamLen, 2); }
super.ajouterVariableGlobale("userID",vWD_userID);


// CBA..Valeur = sessionID + "<FNC1>" + userID
mWD_CBA.setValeur(vWD_sessionID.opPlus("<FNC1>").opPlus(vWD_userID));

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_sessionID = WDVarNonAllouee.ref;
 public WDObjet vWD_userID = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_CODEBARRES
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_CBA = new GWDCBA();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_CODEBARRES
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3308189557546354711l);

super.setChecksum("828445040");

super.setNom("FEN_CODEBARRES");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xE5E5CC);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 407);

super.setTitre("Votre code-barres");

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
// Initialisation des champs de FEN_CODEBARRES
////////////////////////////////////////////////////////////////////////////
mWD_CBA.initialiserObjet();
super.ajouter("CBA", mWD_CBA);
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
return GWDPEventsio.getInstance().mWD_FEN_CODEBARRES;
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
