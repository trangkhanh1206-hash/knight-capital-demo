public class TradingSystem {
    // Giả lập trạng thái của server
    // Trong sự cố Knight Capital, server 8 vẫn để biến này là true (Legacy code)
    private boolean isPowerPegActive = false; 

    /**
     * Hàm xử lý lệnh đã được điều chỉnh để trả về String phục vụ Unit Test.
     * @param flag: 1 là mã định tuyến mới, nhưng code cũ hiểu là Power Peg.
     * @return Trạng thái xử lý của hệ thống.
     */
    public String executeOrder(int flag) {
        // Kiểm tra logic: Nếu nhận flag 1 và vẫn còn mã nguồn cũ
        if (flag == 1) {
            if (isPowerPegActive) {
                return startTrading();
            } else {
                return newChildOrderRouting();
            }
        }
        return "UNKNOWN_FLAG";
    }

    // Hàm giả lập lỗi Power Peg (Xác chết mã nguồn)
    private String startTrading() {
        // Trong thực tế, đây là nơi vòng lặp vô hạn xảy ra
        System.err.println("!!! NGUY HIỂM: Chế độ Power Peg đang chạy !!!");
        return "POWER_PEG_ACTIVE"; 

		/*int orders = 0;
        while (true) {
            orders++;
            System.out.println(ANSI_RED + "[CRITICAL] Power Peg Active: Mua co phieu lenh thu " + orders + ANSI_RESET);
            if (orders > 1000) break; // Dừng giả lập sau 1000 lệnh
        }*/
    }

    // Hàm định tuyến mới (Đúng lý thuyết)
    private String newChildOrderRouting() {
        System.out.println("Hệ thống: Đang thực hiện định tuyến lệnh thông minh...");
        return "SUCCESS_NEW_ROUTING";
    }

    // Hàm Main để bạn có thể chạy thử độc lập trên máy
    public static void main(String[] args) {
        TradingSystem system = new TradingSystem();
        System.out.println("Kết quả vận hành: " + system.executeOrder(1));
    }
}
