package com.pluralsight;

    public class House extends Asset
    {
        public House (String description,String dateAcquired, double originalCost){
            super (description, dateAcquired, originalCost);
        }
        String address;
        int condition;
        int squareFoot;
        int lotSize;

        public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize)
        {
            super(description, dateAcquired, originalCost);
            this.address = address;
            this.condition = condition;
            this.squareFoot = squareFoot;
            this.lotSize = lotSize;
        }

        public String getAddress()
        {
            return address;
        }

        public void setAddress(String address)
        {
            this.address = address;
        }

        public String getCondition()
        {
            if(condition == 1){
                return "Excellent";
            } else if (condition == 2) {
                return "Good";
            } else if (condition ==3) {
                return "Fair";
            } else if(condition == 4) {
                return "Poor";
            }
            return "House Condition";
        }


        public void setCondition(int condition)
        {
            this.condition = condition;
        }

        public int getSquareFoot()
        {
            return squareFoot;
        }

        public void setSquareFoot(int squareFoot)
        {
            this.squareFoot = squareFoot;
        }

        public int getLotSize()
        {
            return lotSize;
        }

        public void setLotSize(int lotSize)
        {
            this.lotSize = lotSize;
        }
        public double getValue(){
            double pricePerSquareFoot = 0.0;
            switch(condition){
                case 1:
                    pricePerSquareFoot = 180.0;
                    break;
                case 2:
                    pricePerSquareFoot = 130.0;
                    break;
                case 3:
                    pricePerSquareFoot = 90.0;
                    break;
                case 4:
                    pricePerSquareFoot = 80.0;
                    break;
            }
            return (pricePerSquareFoot * squareFoot) + (lotSize * .25);
        }
    }


