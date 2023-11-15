package Main;

class Product
{
    private String name;
    private float price;
    private float weight; //weight in kg
    private float pricePerWeight;

    Product(String name, float price, float weight)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.pricePerWeight = this.price/this.weight;
    }
    String GetName()
    {
        return this.name;
    }
    float GetPrice()
    {
        return this.price;
    }
    float GetWeight()
    {
        return this.weight;
    }
    float GetPricePerWeight()
    {
        return pricePerWeight;
    }
}