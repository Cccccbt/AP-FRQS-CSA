public int walkDogs(int hour)
    {
        int companyMax = company.numAvailableDogs(hour);

        if (maxDogs > companyMax)
        {
            company.updateDogs(companyMax);
            return companyMax;
        }

        else
        {
            company.updateDogs(max);
            return max;
        }
    }
