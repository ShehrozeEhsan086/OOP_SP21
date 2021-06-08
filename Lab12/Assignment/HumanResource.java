package lab12_assignment;

import java.util.ArrayList;

public class HumanResource {

    //LAB 12 WITH ASSOCIATION ARRAY BELOW.
    /*
    private Association[] resources;
    private static int index = -1;

    public void addEntity(String name, int id,String type){
        if(type.equals("Teacher")){
            extend();
            resources[index] = new Teacher(name,id);
            ((Teacher)resources[index]).associate();
        } else if(type.equals("Student")){
            extend();
            resources[index] = new Student(name,id);
            ((Student)resources[index]).associate();
        }
    }

    private void extend(){
        if(resources == null){
            resources = new Association[index+2];
        }
        Association[] extendedArray = new Association[index+2];
        for(int i = 0; i<=index;i++){
            extendedArray[i] = resources[i];
        }
        resources = extendedArray;
        index++;
    }

    public void delete(String name){
        int index2 = index;
        Association[] newArray = new Association[index2];
        boolean deleteStatus = false;
        int isolatedIndex=0;
        for(int i=0;i<=index;i++){
            if((resources[i].getName()).equals(name)){
                deleteStatus = true;
                continue;
            }
            newArray[isolatedIndex] = resources[i];
            isolatedIndex++;
        }
        if (deleteStatus){
            index--;
            deleteStatus = false;
        }
        resources = newArray;
    }

    public String toString(){
        if(index<0){
            return "Record Empty!";
        } else {
            String s = "";
            for (int i = 0; i <= index; i++) {
                s = s + resources[i] + "\n";
            }
            return s;
        }
    }
     */

    //LAB 12 WITH ARRAYLIST BELOW.

    private ArrayList<Association> resources;

    public HumanResource(){
        resources = new ArrayList<Association>();
    }

    public void add(Association resources){
        this.resources.add(resources);
        resources.associate();
    }

    public boolean delete(String name){
        boolean deleteStatus = false;
        for(int i = 0;i<resources.size();i++){
            if(name.equals(resources.get(i).getName())){
                resources.remove(i);
                deleteStatus = true;
                break;
            }
        }
        return deleteStatus;
    }

    public String toString(){
        if(resources.isEmpty()){
            return "Record Empty!";
        } else{
            String s="";
            for(int i=0;i<resources.size();i++){
                s = s+resources.get(i)+"\n";
            }
            return s;
        }
    }
}