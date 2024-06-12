package model;

public class invoiceReport {

    private String invoiceId;
    private String cName;
    private String cAddress;
    private String cContactNo;
    private String cId;
    private String no;
    private String product;
    private String brand;
    private String qty;
    private String sellingPrice;
    private String mfd;
    private String exd;
    private String total;
    private String subTotal;
    private String paymentMethod;
    private String fullPayment;
    private String balance;

    public invoiceReport(String invoiceId, String cName, String cAddress, String cContactNo, String cId, String no, String product, String brand, String qty, String sellingPrice, String mfd, String exd, String total, String subTotal, String paymentMethod, String fullPayment, String balance) {
        this.invoiceId = invoiceId;
        this.cName = cName;
        this.cAddress = cAddress;
        this.cContactNo = cContactNo;
        this.cId = cId;
        this.no = no;
        this.product = product;
        this.brand = brand;
        this.qty = qty;
        this.sellingPrice = sellingPrice;
        this.mfd = mfd;
        this.exd = exd;
        this.total = total;
        this.subTotal = subTotal;
        this.paymentMethod = paymentMethod;
        this.fullPayment = fullPayment;
        this.balance = balance;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcContactNo() {
        return cContactNo;
    }

    public void setcContactNo(String cContactNo) {
        this.cContactNo = cContactNo;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getMfd() {
        return mfd;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    public String getExd() {
        return exd;
    }

    public void setExd(String exd) {
        this.exd = exd;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getFullPayment() {
        return fullPayment;
    }

    public void setFullPayment(String fullPayment) {
        this.fullPayment = fullPayment;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
