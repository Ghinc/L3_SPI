import random

global count

class class_de:
    
    global count
    count=0
    MAX_FACE=120
    MIN_FACE=3
    
    def __init__(self, nbfaces=6, nom="aah"):
        global count
        count +=1
        self. setnom(nom)
        self.setnbfaces(nbfaces)
       
        
       
    def setnom(self,nouveau_nom):
        if (nouveau_nom!=""):
            self.nom=nouveau_nom
        else:
            print("Ton nom n'est pas valide")
            self.nom="sannom"
        
  
    
    def setnbfaces(self,nbfaces):
        global MAX_FACE
        global MIN_FACE
        if MIN_FACE<=nbfaces<=MAX_FACE:
            self.nbfaces=nbfaces
        else:
            print("Esoèce de clampin, le nombre de faces n'est pas valide")
            self.nbfaces=6
        
   
    
    def lancer(self):
        self.valeur=random.randint(1, self.nbfaces)
        return self.valeur
    
    def lancer2(self, nb_lancers):
        liste=[]
        for i in range(nb_lancers):
            liste.append(self.lancer())
        self.valeur=max(liste)
        return self.valeur
    
lede=class_de(7,"")
lede2=class_de(9,"blip")
print(lede.nbfaces)
print(lede.nom)
print("Le nombre de dés est : " + str(count))
lede.setnom("blop")
print("Nouveau nom du dé : "+lede.nom)
print("on lance le dé : " +str(lede.lancer()))
print("Le meilleur lancer : "+ str(lede2.lancer2(10)))