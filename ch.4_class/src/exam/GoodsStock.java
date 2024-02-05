package exam;

public class GoodsStock {

  // 속성 : 상품코드(p1011), 재고수량(300)

  private String goodsCode;
  private int stock;

  public GoodsStock() {
    // default 생성자
  }

  public GoodsStock(String goodsCode, int stock) {
    this.goodsCode = goodsCode;
    this.stock = stock;
  }
}
