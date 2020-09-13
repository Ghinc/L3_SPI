# -*- coding: utf-8 -*-
"""
Created on Mon Sep  7 14:43:18 2020

Fontions demandées dans l'atelier numéro 1

Version 1

@author: Ghinevra Comiti, Johanna Fericean
@reviewer: Axel Frau
"""

"""
REVIEW :
Ligne 21, ligne 33, ligne 34, 
"""

#Exercice 1


def salaire() : #-> float: #preciser le type de la variable à return
    """calcule le salaire selon le nombre d'heures effectuées"""
    PALIER_HEURES_1=160
    PALIER_HEURES_2=200
    MAJORATION=0.25
    nb_heures=float(input("Combien d'heures avez-vous fait ?"))
    tx_hor=float(input("Quel est votre taux horaire ?"))
    total=nb_heures*tx_hor #salaire de base, sans majoration 
    if(nb_heures>PALIER_HEURES_1):
        total+=tx_hor*MAJORATION*(nb_heures-PALIER_HEURES_1) #majorations heures supp entre 160 et 200
        if(nb_heures>PALIER_HEURES_2):  #majoration heures supp supérieures à 200
            total+=(nb_heures-PALIER_HEURES_2)*tx_hor*MAJORATION
    return(total) #return(total) dans le return inutile => return total
        
#salaire()
"""appel de la fonction salaire"""
        
#Exercice2
def asci(): #voir ligne 21
    """indique la catégorie de chaque caractère en fonction de son code ascii"""
    FIN_CAR_SPEC=33 #code de fin des caractères spéciaux
    DEB_CHIFFRES=47 #code de début des chiffres
    FIN_CHIFFRES=58
    DEB_MAJ=64 #code de début des lettres majuscules
    FIN_MAJ=91
    DEB_MIN=96 #code de début des lettres minuscules
    FIN_MIN=123
    car=(input("Entrez le caractère désiré")) #??? Parenthèse inutile =>  car= input("Entrez le caractère désiré")
    code=ord(car) #trouve le code ascii du caractère
    if(code< FIN_CAR_SPEC): #si le code ascii est inférieur à 33
         print("c'est un contrôle")#l'exercice ne demandait pas de differencier les caracteres des controles normalement
    elif(DEB_CHIFFRES<code<FIN_CHIFFRES): #si le code correspond à un chiffre
         print("c'est un chiffre")
    elif(DEB_MAJ<code<FIN_MAJ):
         print("C'est une lettre majuscule")
    elif(DEB_MIN<code<FIN_MIN):
         print("c'est une lettre minuscule")
    else: #si ça ne correpond pas aux autres caractères, c'est un caractère spécial
        print("c'est un caractère spécial")

#asci(" ") 
"""appel de la fonction asci"""
         

#Exercice 3

def impots(): #voir ligne 21
    """détermine si l'habitant est imposable
    sexe=1: homme, sexe=2: femme"""
    AGE_MIN_H=20 #âge minimum pour qu'un homme soit imposable
    AGE_MIN_F=17 #âge minimum pour qu'une femme soit imposable
    AGE_MAX_F=36 #âge macimum pour qu'une femme soit imposable
    SEXE_H= 1 #nombre correspondant aux hommmes
    SEXE_F=2 #chiffre correspondant aux femmes
    sexe=int(input("Quel est le sexe de l'habitant ?")) 
    age=int(input("Quel est l'âge de l'habitant ?"))
    #imp=False #habitant non imposable
    imp=(sexe==SEXE_H and age>AGE_MIN_H)or (sexe==SEXE_F and AGE_MIN_F<age<AGE_MAX_F) #conditions qui font qu'un habitant est imposable
    
    print(imp)

#impots()
"""appel de la fonction impots"""

#Exercice 4

def repro(): #voir ligne 21
    """calcul le coût de la reproduction de photos"""
    """nb_photo est de type entier"""
   
    PALIER_PRIX_1=10 #nombre de photos pour lesquelles s'applique le prix 1
    PRIX_1=0.1 #prix pour une photo si moins de 10 photos
    PALIER_PRIX_2= 30 #limite de photos pour l'application du prix 2
    PRIX_2=0.09 #prix pour une photo de la dixième à la vingtième
    PRIX_3=0.08 #prix pour les photos au-dessus de la trentième
    PRIX_10=1 #le prix des 10 premières photos, en lot
    PRIX_20=1.8 #le prix des 20 photos suivantes, en lot (de la 10ème à la 30ème)
   
    nb_photo=int(input("Combien de photos voulez-vous ?")) 
    
    if(nb_photo<=PALIER_PRIX_1): #s'il y a moins de 10 photos
        total=nb_photo*PRIX_1
    elif(nb_photo<=PALIER_PRIX_2): #si plus de 10 photos, 0.1*10=1
        total=PRIX_10+(nb_photo-PALIER_PRIX_1)*PRIX_2
    else: 
        total= PRIX_10+PRIX_20+(nb_photo-PALIER_PRIX_2)*PRIX_3
    print(total)

#repro()
"""appel de la fonction repro"""

#Exercice 5

def voilier(): #voir ligne 21
    """détermination du coût annuel de la place de port du bateau"""
    PALIER_LONG_1=4 #petit bateau
    PALIER_LONG_2=10 #bateau moyen
    PALLIER_LONG_3=12 #grand bateau
    COUT_BASE=100 #coût de base
    AUGM_1=100 #première augmentation du coût mensuel
    AUGM_2=200 #deuxième augmentation du coût mensuel
    CAT_1=1 #première catégorie
    CAT_2=2 #deuxième catégorie
    CAT_3=3 #troisième catégorie
    TAXE_1=100 #taxe catégorie 1
    TAXE_2=150 #taxe catégorie 2
    TAXE_3=250 #taxe catégorie 3
    NB_MOIS=12 #nombre de mois sur lequel est appliqué le tarif
   
    nom=input("Quel est le nom du voilier ?")
    long=int(input("Quelle est la longueur du voilier ?"))
    cat=int(input("Quelle est la catégorie du voilier ?"))
    
    cout=COUT_BASE 
    if(long>PALIER_LONG_1): #augmentation du coût selon la longueur du bateau
        cout+=AUGM_1
        if(long>PALIER_LONG_2):
            cout+=AUGM_2
            if(long>PALLIER_LONG_3):
                cout+=AUGM_2
    print("Le cout mensuel est"+str(cout))
    taxe=0 #détermination de la taxe selon la catégorie
    if(cat==CAT_1):
        taxe=TAXE_1
    elif(cat==CAT_2):
        taxe=TAXE_2
    elif(cat==CAT_3):
        taxe=TAXE_3
    else:
        print("la categorie est incorrecte") #si la catégorie n'est pas valide
    cout_ann=taxe+cout*NB_MOIS
    phrase="Le cout annuel d'une place de port pour le voilier "+nom+" est de"+str(cout_ann)+"euros"
    print(phrase)
    
#voilier()
    
    
    

#Exercice 6

def voiture(): #voir ligne 21
    """fonction calculant le coût de consommation et d'entretien d'une voiture"""
    LIMITE_CYL=2000
    CONS_CARB_GC=10 #coût de l'essence pour les petites cylidrées pour 100 km
    CONS_CARB_PC=8 #coût de l'essence pour les grosses cylindrées aux 100 km
    CONS_DIESEL=8 #coût du diesel
    MAJORATION_DIESEL=0.7 #majoration pour les véhicules diesel
    MAJORATION_ESSENCE=0.5 #majoration pour les véhicules essence
    
    carb=input("Quel est votre carburant ?")
    cyl=int(input("Quel cylidre avez-vous ?"))
    nb_km=float(input("Combien de kilomètres parcourus ?"))
    prix=float(input("Quel est le prix du carburant au litre ?"))
    
    cout_tot=0
    cout_carb=0
    surcout=0
    
    if(carb=="essence"): #si la voiture roule à l'essence
        if(cyl>LIMITE_CYL): #si son moteur est un gros cylindré
            cout_carb=(nb_km/100)*CONS_CARB_GC*prix #coût du carburant
            surcout=MAJORATION_ESSENCE*cout_carb #surcoût lié à l'entretien
        elif(cyl<=LIMITE_CYL): #si son moteur est un petit cylindré
            cout_carb=(nb_km/100)*CONS_CARB_PC*prix
            surcout=MAJORATION_ESSENCE*cout_carb
    elif(carb=="diesel"):  #si le moteur est un diesel
        cout_carb=(nb_km/100)*CONS_DIESEL*prix
        surcout=MAJORATION_DIESEL*cout_carb
    else:
        print("Le carburant saisi est incorrect")
    cout_tot=cout_carb+surcout #calcul du couût total
    print(cout_tot)
    
#voiture()

#Exercice 7


    
def tri(liste): #voir ligne 21
    """algorithme de tri par insertion """
    x=0
    for i in range (0, len(liste)):
        for j in range (0,len(liste)): #on parcourt la liste
            if liste[j]>liste[i]: #si un élément n'est pas à sa place, on l'échange
                x=liste[i]
                liste[i]=liste[j]
                liste[j]=x
    return liste

def elections(): #voir ligne 21
    """fonction qui gère les élections municipales"""
    NOMBRE_CANDIDATS=4 #nombre de candidats participants à l'élection
    SCORE_GAGNANT=50 #score nécessaire pour gagner au premier tour
    SCORE_TOUR_2=12.5 #score nécessaire pour passer au tour 2
    
    scores=[] #tableau utilisé pour stocker les scores des différents candidats
    win=False #variable utilisée poir stopper la fonction dès lors qu'un candidat a gagné
    for i in range (0,NOMBRE_CANDIDATS): #on entre les scores des 4 candidats dans un tableau
        print("entrez le score du candidat numéro "+str(i+1) + " : ")
        score=float(input())
        scores.append(score)
        if (scores[i]>SCORE_GAGNANT): #cas où un condidat est élu au premier tour
            print("le candidat numéro "+ str(i+1) + " a été élu au premier tour")
            win=True
            break #si un candidat gagne, on sort de la boucle
    if win!=True:
        print("on se focalise sur le candidat n°1 : ")
        if(scores[0]>SCORE_TOUR_2): #on teste si le candidat peut participer au tour 2
            print("Le candidat 1 peut participer au deuxième tour")
            score_can_1=scores[0] #on sauvegarde le score du candidat 1
            tri(scores) #on trie les scores dans l'ordre croissant
            if(scores[3]==score_can_1): #si les deux sont égaux, le candidat a le plus haut score
                print("le candidat est en ballotage favorable")
            else:
                print("le candidat est en ballotage défavorable")
        else: #si le candidat n'a pas le score nécessaire
            print("Le candidat 1 ne peut pas participer au deuxième tour et est éliminé")
        
        
elections()

#exercice 8

def assurance(): #voir ligne 21
    """cette fonction calcule si le conducteur est assurable ou non, et, si oui,
    quel sera son tarif. Pour cela, elle se base sur un système de compatge de points,
    chaque score correspondant à une couleur."""
    
    #l'age minimum pour avoir plus d'offres
    AGE_MINIMUM = 25
    #l'ancienneté minimal(en année) de permis  pour avoir plus d'offres
    ANCIENNETE_MIN_PERMIS = 2
    #l'ancienneté(en année) nécessaire pour avoir la couleur supérieure
    ANCIENNETE_MIN_ASSUR = 1
    # les différents tarifs sont associés à un score numérique dans un dico
    """
    On peut remplacer : 
    tarifs = dict()
    tarifs[-1]= "pas assuré" #si l'individu a -1 point il n'est pas assuré
    tarifs[0] = "tarif rouge"# si l'individu a 0 point il a le tarif rouge etc
    tarifs[1] = "tarif orange"
    tarifs[2] = "tarif vert"
    tarifs[3]= " tarif bleu"

    par : 
    tarifs =["tarif rouge", "tarif orange", "tarif vert","tarif bleu","pas assuré"] 
               #[0]            #[1]            #[2]           #[3]         #[-1]

    Je ne vois pas comment il peuvent atteindre le tarif bleu besoin de plus de clarté la 
    dedans car il n'est pas m'entionner dans les commentaires.
    """
    tarifs = dict()
    tarifs[-1]= "pas assuré" #si l'individu a -1 point il n'est pas assuré
    tarifs[0] = "tarif rouge"# si l'individu a 0 point il a le tarif rouge etc
    tarifs[1] = "tarif orange"
    tarifs[2] = "tarif vert"
    tarifs[3]= "tarif bleu"

    #initialisation de la variable nb_points
    nb_points = -1
    # saisies des données
    age = int(input("quel âge avez vous ?"))
    anciennete_permis = int(input("depuis combien de temps avez vous votre permis ?"))
    nb_accident = int(input("combien d'accidents avez vous eu ?"))
    anciennete_client = int(input("depuis combien d'années êtes vous assuré dans notre assurance ?"))

    #selon leur age, leur ancienneté de permis, leurs nombres d'accidents, ils recoivent des points
    if((age<AGE_MINIMUM)and(anciennete_permis<ANCIENNETE_MIN_PERMIS)):
        if(nb_accident==0):
            #1 point pour accéder au tarif rouge
            nb_points+=1
    elif((age>AGE_MINIMUM)and(anciennete_permis>=ANCIENNETE_MIN_PERMIS)):
        if(nb_accident==0):
            # 3 points pour accéder au tarif vert
            nb_points+=3
        if(nb_accident==1):
            # 2 points pour accéder au tarif orange
            nb_points+=2
        if(nb_accident==2):
            # 1 point pour accéder au tarif rouge
            nb_points+=1
    else:
        if(nb_accident==0):
            #2 points pour accéder au tarif orange
            nb_points+=2
        if(nb_accident==1):
            #1 point pour accéder au tarif rouge
            nb_points+=1

    if (anciennete_client >= ANCIENNETE_MIN_ASSUR):
        """
        Si il a un tarif bleu alors il passera de "[3]" à "[4]" qui dans ce vous avez fait est "pas assuré"
        car dans votre dictionnaire [4] = [-1] donc il faut vérifier qu'il n'est pas bleu avant de faire ça.
        """
        #si le client est assuré depuis au moins 1 an il gagne un point pour avoir le tarif supérieur
        nb_points+=1

    print(tarifs[nb_points])

assurance()