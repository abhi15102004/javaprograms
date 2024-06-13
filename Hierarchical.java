class superHero {
	String name;
	String power;
	public superHero(String name, String power) {
	    this.name = name;
	    this.power = power;
	}
	public void usePower() {
	    System.out.println(name + " uses " + power);
	}
    }
class IronMan extends superHero {
	public IronMan(String name) {
	     super(name, "advanced technology");
	}
}
class spiderman extends superHero {
	public spiderman(String name) {
	     super(name, "web-slinging and spider-like abilities");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
	    IronMan ironMan = new IronMan("Iron Man");
	    spiderman spiderMan = new spiderman("spider Man");
	ironMan.usePower();
	spiderMan.usePower();
	}
}
