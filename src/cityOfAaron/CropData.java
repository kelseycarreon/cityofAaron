/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityOfAaron;
import java.io.Serializable;
/**
 *
 * @author khaddow
 */
public class CropData  implements Serializable{
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;       
    private int harvestAfterOffering;       
    private int offering;      
    private int offeringBushel;      
    private int peopleFed;     
    private int acresPlanted;       
    private int numStarved;        
    private int eatenByRats;       
    private int wheatForPeople;  

    public CropData() {
    }
    
    

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getCropYield() {
        return cropYield;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }

    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }

    public int getOffering() {
        return offering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public int getOfferingBushel() {
        return offeringBushel;
    }

    public void setOfferingBushel(int offeringBushel) {
        this.offeringBushel = offeringBushel;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public int getNumStarved() {
        return numStarved;
    }

    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    public int getEatenByRats() {
        return eatenByRats;
    }

    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    public int getWheatForPeople() {
        return wheatForPeople;
    }

    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.year;
        hash = 61 * hash + this.population;
        hash = 61 * hash + this.acresOwned;
        hash = 61 * hash + this.cropYield;
        hash = 61 * hash + this.wheatInStore;
        hash = 61 * hash + this.numberWhoDied;
        hash = 61 * hash + this.newPeople;
        hash = 61 * hash + this.harvest;
        hash = 61 * hash + this.harvestAfterOffering;
        hash = 61 * hash + this.offering;
        hash = 61 * hash + this.offeringBushel;
        hash = 61 * hash + this.peopleFed;
        hash = 61 * hash + this.acresPlanted;
        hash = 61 * hash + this.numStarved;
        hash = 61 * hash + this.eatenByRats;
        hash = 61 * hash + this.wheatForPeople;
        return hash;
    }

    @Override
    public String toString() {
        return "CropData{" + "year=" + year + ", population=" + population + ", acresOwned=" + acresOwned + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", harvestAfterOffering=" + harvestAfterOffering + ", offering=" + offering + ", offeringBushel=" + offeringBushel + ", peopleFed=" + peopleFed + ", acresPlanted=" + acresPlanted + ", numStarved=" + numStarved + ", eatenByRats=" + eatenByRats + ", wheatForPeople=" + wheatForPeople + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CropData other = (CropData) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.population != other.population) {
            return false;
        }
        if (this.acresOwned != other.acresOwned) {
            return false;
        }
        if (this.cropYield != other.cropYield) {
            return false;
        }
        if (this.wheatInStore != other.wheatInStore) {
            return false;
        }
        if (this.numberWhoDied != other.numberWhoDied) {
            return false;
        }
        if (this.newPeople != other.newPeople) {
            return false;
        }
        if (this.harvest != other.harvest) {
            return false;
        }
        if (this.harvestAfterOffering != other.harvestAfterOffering) {
            return false;
        }
        if (this.offering != other.offering) {
            return false;
        }
        if (this.offeringBushel != other.offeringBushel) {
            return false;
        }
        if (this.peopleFed != other.peopleFed) {
            return false;
        }
        if (this.acresPlanted != other.acresPlanted) {
            return false;
        }
        if (this.numStarved != other.numStarved) {
            return false;
        }
        if (this.eatenByRats != other.eatenByRats) {
            return false;
        }
        if (this.wheatForPeople != other.wheatForPeople) {
            return false;
        }
        return true;
    }

    
    
            
}




