package Spells;

public class SpellsCrusader extends Spells {
	
	private Integer dammage;
	private Integer costAction;
	private String effect;
	
	public SpellsCrusader(String id, String name, Integer level, Integer dammage, Integer costAction, String effect) {
		super(id, name, level);
		this.dammage = dammage;
		this.costAction = costAction;
		this.effect = effect;
	}
	public Integer getDammage() {
		return dammage;
	}
	public void setDammage(Integer dammage) {
		this.dammage = dammage;
	}
	public Integer getCostAction() {
		return costAction;
	}
	public void setCostAction(Integer costAction) {
		this.costAction = costAction;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}	
}