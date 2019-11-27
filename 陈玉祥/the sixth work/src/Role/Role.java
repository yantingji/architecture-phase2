package Role;

public abstract class Role {
	protected int name;
	protected int age;
    protected int sex;
    
    public Role() {
    	
    }
    
    public int getName() {
    	return name;
    }
    
    public void setName(int name) {
    	this.name = name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public int getSex() {
    	return sex;
    }
    
    public void setSex(int sex) {
    	this.sex = sex;
    }
	
    public abstract void play();
    
    public Role(int name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public Role(int name, int age, int sex) {
    	this.name = name;
    	this.age = age;
    	this.sex = sex;
    }
    
}
