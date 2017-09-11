> ## 常用的设计模式（java 实现）


参考资料：

https://github.com/iluwatar/java-design-patterns

https://www.gitbook.com/book/quanke/design-pattern-java/details

Android 中的设计模式：
https://github.com/simple-android-framework-exchange/android_design_patterns_analysis


## 面向对象设计原则
* 单一职责原则(Single Responsibility Principle, SRP)

一个类只负责一个功能领域中的相 应职责，或者可以定义为:就一个类而言，应该只有一个引起它变化的原因
* 开闭原则(Open-Closed Principle, OCP)

一个软件实体应当对扩展开放，对修改关闭。即软件 实体应尽量在不修改原有代码的情况下进行扩展。

* 里氏代换原则(Liskov Substitution Principle, LSP)

所有引用基类(父类)的地方必须能透明地使用其子类的对象。

* 依赖倒转原则(Dependency Inversion Principle, DIP)

抽象不应该依赖于细节，细节应当依赖于抽象。换言之，要针对接口编程，而不是针对实现编程。

* 接口隔离原则(Interface Segregation Principle, ISP)

使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口。

* 合成复用原则(Composite Reuse Principle, CRP)

尽量使用对象组合，而不是继承来达到复 用的目的。

* 迪米特法则(Law of Demeter, LoD)

一个软件实体应当尽可能少地与其他实体发生相互作用。
### 创建型
* 单例
* 工厂
* 建造者
* 原型

### 结构型
* 适配器
* 装饰
* 外观
* 代理
* 桥接
* 组合
* 享元

### 行为型
* 观察者
* 策略
* 模板方法
* 责任链
* 命令
* 访问者
* 中介者
* 备忘录
* 状态
* 解释器
