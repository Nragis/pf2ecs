package pf2ecs.model;

import java.util.HashSet;
import java.util.Hashtable;
//import pf2ecs.model.Action;
//import pf2ecs.model.Spell;

/** The Feat class holds all the information about each feat including its description, any relevant actions or spells, and more
 *
 * @author Quinn Murphey
 * @author David Gellhausen
 * @author Jim Richmond
 * @author Alexander Lomeli-Azoubel
 * @since 03/26/2021
 */
public class Feat {
    
    /** 
     *
     */
    private String name;
    private int level;
    private HashSet<String> traits = new HashSet<String>();
    private HashSet<String> prerequisites = new HashSet<String>();
    private String description;
    private boolean multiple;
    private Hashtable<String, Integer> attributeBonuses = new Hashtable<String, Integer>();
    private Hashtable<String, Integer> proficiencyBonuses = new Hashtable<String,Integer>();
    
//    private HashSet<Action> actions = new HashSet<Actions>;
//    private HashSet<Spell> spells = new HashSet<Spells>;
    
    /** Constructor Method
     *  
     *  @param name (String) The name of the feat
     */
    public Feat(String name){
        this.name = name;
    }
    
    /** 
     * Returns this.name
     *  @return this.name (String)
     */
    public String getName(){
        return this.name;
    }

    /** 
     * Sets this.name
     * @param name (String)
     */
    public void setName(String name){
        this.name = name;
    }

	/**
	 * Getter for this.level.
	 * @return Returns this.level
	 */
	public int getLevel(){
		return this.level;
	}

	/**
	 * Setter for this.level.
	 * @param level (int) Sets this.level to level
	 */
	public void setName(int level){
		this.level= level;
	}
    
	/**
	 * Getter for this.traits.
	 * @return Returns this.traits.
	 */
	public HashSet<String> getTraits(){
		return this.traits;
	}

	/**
	 * Setter for this.traits.
	 * @param traits (HashSet<String>)
	 */
	public void setTraits(HashSet<String> traits){
		this.traits = traits;
	}
    
	/**
	 * Adds trait to this.traits.
	 * @param trait (String) 
	 */
    public void addTrait(String trait){
        this.traits.add(trait);
    }

	/**
	 * Removes trait from this.trait if present.
	 * @param trait (HashSet<String>)
	 */
    public void removeTrait(String trait){
        if(this.traits.contains(trait)){
            this.traits.remove(trait);
        }
    }

    /**
	 * Getter for this.prerequisites.
	 * @return Returns this.prerequisites.
	 */
	public HashSet<String> getPrerequisite(){
		return this.prerequisites;
	}

	/**
	 * Setter for this.prerequisites.
	 * @param prerequisites (HashSet<String>)
	 */
	public void setPrerequisites(HashSet<String> prerequisites){
		this.prerequisites = prerequisites;
	}
    
	/**
	 * Adds prerequisite to this.prerequisite.
	 * @param prerequisite (String) 
	 */
    public void addPrerequisite(String prerequisite){
        this.prerequisites.add(prerequisite);
    }

	/**
	 * Removes prerequisite from this.prerequisite if present.
	 * @param prerequisite (HashSet<String>)
	 */
    public void removePrerequisite(String prerequisite){
        if(this.prerequisites.contains(prerequisite)){
            this.prerequisites.remove(prerequisite);
        }
    }

	/**
	 * Getter for this.description.
	 * @return Returns this.description
	 */
	public String getDescription(){
		return this.description;
	}

	/**
	 * Setter for this.description.
	 * @param description (String) Sets this.description to description 
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Getter for this.multiple.
	 * @return Returns this.multiple
	 */
	public boolean getMultiple(){
		return this.multiple;
	}

	/**
	 * Setter for this.multiple.
	 * @param name Sets this.multiple to multiple
	 */
	public void setMultiple(boolean multiple){
		this.multiple = multiple;
	}

	/**
	 * Getter for this.attributeBonuses.
	 * @return Returns this.attributeBonuses
	 */
	public Hashtable<String, Integer> getAttributeBonuses(){
		return this.attributeBonuses;
	}

	/**
	 * Setter for this.attributeBonuses.
	 * @param name Sets this.attributeBonuses to attributeBonuses
	 */
	public void setAttributeBonuses(Hashtable<String, Integer> attributeBonuses){
		this.attributeBonuses = attributeBonuses;
	}

    /**
	 * Adds attribute, bonus to this.attributeBonuses.
	 * @param attribute (String) 
	 * @param bonus (int) 
	 */
    public void addAttributeBonus(String attribute, int bonus){
        this.attributeBonuses.put(attribute, bonus);
    }

	/**
	 * Removes attribute from this.attributeBonuses if present.
	 * @param attribute (HashSet<String>)
	 */
    public void removeAttributeBonus(String attribute){
        if(this.attributeBonuses.contains(attribute)){
            this.attributeBonuses.remove(attribute);
        }
    }

    /**
	 * Getter for this.proficiencyBonuses.
	 * @return Returns this.proficiencyBonuses
	 */
	public Hashtable<String, Integer> getProficiencyBonuses(){
		return this.proficiencyBonuses;
	}

	/**
	 * Setter for this.proficiencyBonuses.
	 * @param name Sets this.proficiencyBonuses to proficiencyBonuses */
	public void setProficiencyBonuses(Hashtable<String, Integer> proficiencyBonuses){
		this.proficiencyBonuses = proficiencyBonuses;
	}

    /**
	 * Adds proficiency, bonus to this.proficiencyBonuses.
	 * @param proficiency (String) 
	 * @param bonus (int) 
	 */
    public void addProficiencyBonus(String proficiency, int bonus){
        this.proficiencyBonuses.put(proficiency, bonus);
    }

	/**
	 * Removes proficiency from this.proficiencyBonuses if present.
	 * @param proficiency (HashSet<String>)
	 */
    public void removeProficiencyBonus(String proficiency){
        if(this.proficiencyBonuses.contains(proficiency)){
            this.proficiencyBonuses.remove(proficiency);
        }
    }
}