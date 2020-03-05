/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Eventsio
 * Date : 06/02/2020 17:39:30
 * Version de wdjava.dll  : 24.0.175.3
 */


package com.masociete.pointage.wdgen;


import com.masociete.pointage.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPEventsio extends WDProjet
{
/**
 * Accès au projet: Eventsio
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPEventsio.getInstance()
 */
public static GWDPEventsio getInstance()
{
return (GWDPEventsio) ms_instance;
}

 // FEN_SCAN
public GWDFFEN_SCAN mWD_FEN_SCAN = new GWDFFEN_SCAN();
 // accesseur de FEN_SCAN
public GWDFFEN_SCAN getFEN_SCAN()
{
mWD_FEN_SCAN.verifierOuverte();
return mWD_FEN_SCAN;
}

 // FEN_PRESENCE
public GWDFFEN_PRESENCE mWD_FEN_PRESENCE = new GWDFFEN_PRESENCE();
 // accesseur de FEN_PRESENCE
public GWDFFEN_PRESENCE getFEN_PRESENCE()
{
mWD_FEN_PRESENCE.verifierOuverte();
return mWD_FEN_PRESENCE;
}

 // FEN_GESTION
public GWDFFEN_GESTION mWD_FEN_GESTION = new GWDFFEN_GESTION();
 // accesseur de FEN_GESTION
public GWDFFEN_GESTION getFEN_GESTION()
{
mWD_FEN_GESTION.verifierOuverte();
return mWD_FEN_GESTION;
}

 // FEN_ACCUEIL
public GWDFFEN_ACCUEIL mWD_FEN_ACCUEIL = new GWDFFEN_ACCUEIL();
 // accesseur de FEN_ACCUEIL
public GWDFFEN_ACCUEIL getFEN_ACCUEIL()
{
mWD_FEN_ACCUEIL.verifierOuverte();
return mWD_FEN_ACCUEIL;
}

 // FEN_SESSIONS
public GWDFFEN_SESSIONS mWD_FEN_SESSIONS = new GWDFFEN_SESSIONS();
 // accesseur de FEN_SESSIONS
public GWDFFEN_SESSIONS getFEN_SESSIONS()
{
mWD_FEN_SESSIONS.verifierOuverte();
return mWD_FEN_SESSIONS;
}

 // FEN_CODEBARRES
public GWDFFEN_CODEBARRES mWD_FEN_CODEBARRES = new GWDFFEN_CODEBARRES();
 // accesseur de FEN_CODEBARRES
public GWDFFEN_CODEBARRES getFEN_CODEBARRES()
{
mWD_FEN_CODEBARRES.verifierOuverte();
return mWD_FEN_CODEBARRES;
}


 // Constructeur de la classe GWDPEventsio
public GWDPEventsio()
{
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
setNomCollectionProcedure(new String[]{});
ajouterFenetre("FEN_SCAN", mWD_FEN_SCAN);
ajouterFenetre("FEN_PRESENCE", mWD_FEN_PRESENCE);
ajouterFenetre("FEN_GESTION", mWD_FEN_GESTION);
ajouterFenetre("FEN_ACCUEIL", mWD_FEN_ACCUEIL);
ajouterFenetre("FEN_SESSIONS", mWD_FEN_SESSIONS);
ajouterFenetre("FEN_CODEBARRES", mWD_FEN_CODEBARRES);


}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
public String getVersionApplication(){ return "0.0.9.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "Pointage";}
public int getIdNomApplication(){return com.masociete.pointage.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.pointage";}
public int getIdIconeApplication(){ return com.masociete.pointage.R.drawable.i_c_o_n_e________0;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 480;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Eventsio";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterPolicePerso("Barlow Semi Condensed Medium","barlowsemicondensed_medium_1.ttf");
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPEventsio.class;
}
}
}
