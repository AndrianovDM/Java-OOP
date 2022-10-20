package Homework3.src.service;

import Homework3.src.data.Gender;
import Homework3.src.data.Human;
import Homework3.src.data.Relation;
import Homework3.src.data.Relative;
import java.util.List;

public class ListData {

    public void ListDataHumanRelative(List<Human> humanArrList, List<Relative> relativeArrList){
        humanArrList.add(new Human("Михаил", "Николаевич", "Андрианов", 45, Gender.MALE));
        humanArrList.add(new Human("Ирина", "Михайловна", "Андрианова", 42, Gender.FEMALE));
        humanArrList.add(new Human("Дмитрий", "Михайлович", "Андрианов", 25, Gender.MALE));
        humanArrList.add(new Human("Варвара", "Васильевна", "Баядина", 19, Gender.MALE));
        humanArrList.add(new Human("Надежда", "Михайловна", "Андрианова", 62, Gender.FEMALE));
        humanArrList.add(new Human("Николай", "Александрович", "Андрианов", 67, Gender.MALE));
        
        relativeArrList.add(new Relative(
                new Human("Михаил", "Николаевич", "Андрианов", 45, Gender.MALE),
                Relation.HUSBAND,
                new Human("Ирина", "Михайловна", "Андрианова", 42, Gender.FEMALE)));

        relativeArrList.add(new Relative(
                new Human("Ирина", "Михайловна", "Андрианова", 42, Gender.FEMALE),
                Relation.WIFE,
                new Human("Михаил", "Николаевич", "Андрианов", 45, Gender.MALE)));

        relativeArrList.add(new Relative(
                new Human("Михаил", "Николаевич", "Андрианов", 45, Gender.MALE),
                Relation.FATHER,
                new Human("Дмитрий", "Михайлович", "Андрианов", 25, Gender.MALE)));
        
        relativeArrList.add(new Relative(
                new Human("Дмитрий", "Михайлович", "Андрианов", 25, Gender.MALE),
                Relation.BROTHER,
                new Human("Варвара", "Васильевна", "Баядина", 19, Gender.MALE)));
        
        relativeArrList.add(new Relative(
                new Human("Надежда", "Михайловна", "Андрианова", 62, Gender.FEMALE),
                Relation.GRANDMOTHER,
                new Human("Дмитрий", "Михайлович", "Андрианов", 25, Gender.MALE)));

        relativeArrList.add(new Relative(
                new Human("Николай", "Александрович", "Андрианов", 67, Gender.MALE),
                Relation.GRANDFATHER,
                new Human("Дмитрий", "Михайлович", "Андрианов", 25, Gender.MALE)));
        }
}