/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityOfAaron;

/**
 *
 * @author khaddow
 */
public enum TeamMembers {
        Marshall ("Marshall", "Ready Player One"),
        Kelsey ("Kelsey", "Awesome Baker");
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TeamMembers{" + "name=" + name + ", title=" + title + '}';
    }
   
    
    
    
    
TeamMembers (String name, String title){
    this.name = name;
    this.title = title;
    }

}
