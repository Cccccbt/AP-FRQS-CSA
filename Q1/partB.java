public int dogWalkShift(int startHour, int endHour)
    {
        int sum = 0;
        int now = 0;
        for (int i = startHour - 1; i < endHour; i++)
        {
            now = walkDogs(i);
            sum += now * 3;
            
            if ((i <= 16 && i >= 8) || now == maxDogs)
            {
                sum += 3;
            }
        }

        return sum;
    }
