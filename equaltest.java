package app1;

import java.util.Objects;

public class equaltest {

	public static void main(String[] args) {
Monster beast = new Monster(100, 50);
        
        // 输出beast对象的atk和def属性值
        System.out.println("beast的攻击力为：" + beast.getAtk());
        System.out.println("beast的防御力为：" + beast.getDef());
        
        // 创建名为fish的Monster对象，其atk为100，def为50
        Monster fish = new Monster(100, 50);
        
        // 输出fish对象的atk和def属性值
        System.out.println("fish的攻击力为：" + fish.getAtk());
        System.out.println("fish的防御力为：" + fish.getDef());
        
        // 创建名为bird的Monster对象，并将其引用指向beast对象
        Monster bird = beast;
        
        // 输出bird对象的atk和def属性值
        System.out.println("bird的攻击力为：" + bird.getAtk());
        System.out.println("bird的防御力为：" + bird.getDef());
        System.out.println(beast==fish);  
        System.out.println(beast.equals(fish));  
        System.out.println(Objects.equals(fish,beast));  
        System.out.println(beast==bird);  
        System.out.println(beast.equals(bird));   
        System.out.println(Objects.equals(bird,beast));  


	}

}
class Monster {
    private int atk; // 攻击力
    private int def; // 防御力

    // 构造函数
    public Monster(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    // 获取攻击力
    public int getAtk() {
        return atk;
    }

    // 设置攻击力
    public void setAtk(int atk) {
        this.atk = atk;
    }

    // 获取防御力
    public int getDef() {
        return def;
    }

    // 设置防御力
    public void setDef(int def) {
        this.def = def;
    }}

   
