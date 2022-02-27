package Constructor;

import Constructor.impl.Morning;
import Constructor.impl.Sonata;

public class CarFactory {
  /* 외부에서 직접 생성자를 호출 할 수 없도록 private */
  private CarFactory(){}

  /* 비즈니스 로직에 따라 자유롭게 객체를 반환 */
  public static Constructor.impl.Car createCar() {
    return Math.random() >= 0.5 ? new Sonata() : new Morning();
  }

  /* 메서드 오버로딩을 사용하여 기능을 분리 */
  public static Constructor.impl.Car createCar(boolean wantSonata) {
    return wantSonata ? new Sonata() : new Morning();
  }
}
