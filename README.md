# 36-Java-多线程模拟玩游戏的场景.md

```
Chat.java
```

```
public class Chat implements Runnable{

	public void wechar() {
		while(true) {
			System.out.println("wechar");
		}
	}
	@Override
	public void run() {
		wechar();
	}
}

```
```
Play.java
```
```
public class Play implements Runnable{

	public void playgame() {
		while(true) {
			System.out.println("playgame");
		}
	}
	@Override
	public void run() {
		playgame();
	}
}
```
```
Music.java
```
```
public class Music implements Runnable{

	public void playmusic() {
		while(true) {
			System.out.println("playmusic");
		}
	}
	@Override
	public void run() {
		playmusic();
		
	}
}
```
测试类：
```
public class Test {

	public static void main(String[] args) {
		/**
		 * 模拟玩游戏
		 * 1.可以玩游戏
		 * 2.同时可以听音乐
		 * 3.同时可以和队友聊天
		 */
		Play play = new Play();
		
		Chat wechar = new Chat();
		
		Music music = new Music();
		
		Thread t1 = new Thread(play);
		t1.start();
		Thread t2 = new Thread(wechar);
		t2.start();
		Thread t3 = new Thread(music);
		t3.start();
	}
}
```

效果如下：

![](https://upload-images.jianshu.io/upload_images/5227364-afd77f09b7f39acb.gif?imageMogr2/auto-orient/strip)

**以就就是我关于 *Java-多线程模拟玩游戏的场景*  知识点的整理与总结的全部内容,,[另附源码](https://github.com/javaobjects/demo520)**

==================================================================
#### 分割线
==================================================================

**博主为咯学编程：父母不同意学编程，现已断绝关系;恋人不同意学编程，现已分手;亲戚不同意学编程，现已断绝来往;老板不同意学编程,现已失业三十年。。。。。。如果此博文有帮到你欢迎打赏，金额不限。。。**

![](https://upload-images.jianshu.io/upload_images/5227364-e76764b127f255ed.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)