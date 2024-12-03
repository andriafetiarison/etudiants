# **Projet Gestion - Design Pattern MVC et DAO**

## **Introduction**
Ce projet est un exemple pratique qui met en œuvre deux design patterns fondamentaux : **MVC (Model-View-Controller)** et **DAO (Data Access Object)**. L'objectif est de structurer le code de manière claire et modulaire pour faciliter la maintenance et l'évolutivité.

## **Architecture MVC**

### **1. Model (modèle)**
Le **Modèle** représente les données et la logique métier de l'application. Exemple : `Etudiant.java`.

### **2. View (vue)**
La **Vue** est responsable de l'interface utilisateur. Exemple : `EtudiantVue.java`.

### **3. Controller (contrôleur)**
Le **Contrôleur** est la passerelle entre le modèle et la vue. Exemple : `EtudiantController.java`.

## **Pattern DAO**
Le **DAO** sépare la logique d'accès aux données du reste de l'application. Exemple : 
- Interface : `GenericDao.java`
- Implémentation : `EtudiantDaoImpl.java`.

## **Résumé des Packages**
| **Package**       | **Description**                                                      |
|--------------------|----------------------------------------------------------------------|
| `controller`       | Contient le contrôleur qui gère les interactions utilisateur        |
| `dao`              | Contient l'interface DAO et les classes d'accès aux données         |
| `modele`           | Contient la définition du modèle, représentant les données métier   |
| `vue`              | Contient la vue, qui interagit avec l'utilisateur                  |

## **Exemple de Flux MVC avec DAO**
- L'utilisateur saisit les informations dans la vue (**Vue**).
- Le contrôleur (**Controller**) traite cette entrée.
- La DAO enregistre les données dans la base.

## **Avantages**
- **MVC** : Séparation des responsabilités, réutilisabilité.
- **DAO** : Réduction de duplication, isolation de l'accès aux données.
