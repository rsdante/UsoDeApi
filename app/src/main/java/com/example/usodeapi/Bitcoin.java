package com.example.usodeapi;

public class Bitcoin {

    //declara apenas
    private Boolean success;
    private String market;
    private Double last;
    private Double high;
    private Double low;
    private Double avg;
    private Double vol;
    private float var;
    private Double buy;
    private Double sell;
    private String timestamp;

    //gets
    public Boolean getSuccess() {
        return success;
    }

    public String getMarket() {
        return market;
    }

    public Double getLast(){
        return last;
    }

    public Double getHigh() {
        return high;
    }

    public Double getLow() {
        return low;
    }

    public Double getAvg() {
        return avg;
    }

    public Double getVol() {
        return vol;
    }

    public float getVar() {
        return var;
    }

    public Double getBuy() {
        return buy;
    }

    public Double getSell() {
        return sell;
    }

    public String getTimestamp() {
        return timestamp;
    }

    //sets
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public void setLast(Double last) {
        this.last = last;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setVar(float var) {
        this.var = var;
    }

    public void setVol(Double vol) {
        this.vol = vol;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }


    @Override
    public String toString() {
        return "Mercado: " + getMarket()
                + "\nÚltimo valor: " + getLast()
                + "\nMaior valor: " + getHigh()
                + "\nMenor valor:" + getLow()
                + "\nVolume negociado: " + getVol()
                + "\nMédia:" + getAvg()
                + "\nVariância: " + getVar()
                + "\nCompra:" + getBuy()
                + "\nVenda: " + getSell()
                + "\nHora de pesquisa: " + getTimestamp();
    }

}
