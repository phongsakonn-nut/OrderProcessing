/** STRATEGY — "วิธีคำนวณส่วนลด" คืนราคาหลังหักส่วนลดแล้ว */
public interface DiscountStrategy { //ถ้าจะคำนวณส่วนลดหรืออะไรที่เกี่ยวกันส่วนลด ต้องสืบทอดตัวนี้
    double applyDiscount(Order order);
}
