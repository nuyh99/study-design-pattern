## 전략 패턴(Strategy Pattern)

* 알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있다.
* 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.

> Duck 클래스는 필드 변수로 FlyBehavior, QuackBehavior 인터페이스를 의존한다.<br>
> Duck 추상 클래스를 상속한 MallardDuck, ModelDuck<br>
> 각각의 오리 특성에 맞게 Setter를 사용해서 구현체를 갈아 끼운다.

---

## 디자인 퍼즐
### Interface
  * WeaponBehavior
### Abstract Class
  * Character 
    * 필드 변수: WeaponBehavior
    * 필드 메서드: setWeapon()
    * 필드 메서드: fight()
### Class
  * Queen **extends Character**
  * King **extends Character**
  * Troll **extends Character**
  * Knight **extends Character**
  * KnifeBehavior **implements WeaponBehavior**
  * BowAndArrowBehavior **implements WeaponBehavior**
  * AxeBehavior **implements WeaponBehavior**
  * SwordBehavior **implements WeaponBehavior**

---
