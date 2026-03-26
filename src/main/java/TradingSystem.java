public class TradingSystem {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
	public static void main(String[] args) {
	  System.out.println("Hệ thống SMARS bắt đầu hoạt động...");
        // Giả lập server cũ nhận Flag=1 (nhẽ ra là lệnh mới nhưng code cũ hiểu là Power Peg)
        int receivedFlag = 1; 
        executeOrder(receivedFlag);
    }
	
    public static void executeOrder(int flag) {
        if (flag == 1) {
        // ĐÂY LÀ MÃ NGUỒN CHẾT (DEAD CODE) LẼ RA PHẢI XÓA TỪ 8 NĂM TRƯỚC
            activatePowerPegMode(); 
        }
    }
    private static void activatePowerPegMode() {
        int orders = 0;
        while (true) {
            orders++;
            System.out.println(ANSI_RED + "[CRITICAL] Power Peg Active: Mua co phieu lenh thu " + orders + ANSI_RESET);
            if (orders > 1000) break; // Dừng giả lập sau 1000 lệnh
        }
    }
}
