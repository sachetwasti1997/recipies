package com.sachet.recipies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Notes extends BaseEntity{

    @Column(name = "recipe_notes")
    private String recipeNotes;

    @OneToOne(mappedBy = "notes")
    private Recipe recipe;

    public Notes() {
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
