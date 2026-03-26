import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TradingSystemTest {

    @Test
    void testExecuteOrderWithNewFlag() {
        TradingSystem system = new TradingSystem();
        
        // Giả lập kiểm tra: Khi truyền flag = 1, hàm phải trả về trạng thái "SUCCESS_NEW_ROUTING"
        // Nếu nó chạy vào Power Peg, kết quả trả về sẽ sai.
        String result = system.executeOrder(1);
        
        assertEquals("SUCCESS_NEW_ROUTING", result, 
            "❌ THẢM HỌA: Hệ thống không định tuyến lệnh mới mà lại kích hoạt Power Peg!");
    }
}
