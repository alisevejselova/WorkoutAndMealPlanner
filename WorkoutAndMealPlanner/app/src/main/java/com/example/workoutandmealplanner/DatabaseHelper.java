package com.example.workoutandmealplanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "WorkoutAndMeal.db";

    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 5);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE RegisteredUser (ID INTEGER PRIMARY  KEY AUTOINCREMENT, username TEXT, password TEXT, email TEXT)");
        db.execSQL("CREATE TABLE Workouts (workoutname VARCHAR, workoutURL VARCHAR, level VARCHAR,type VARCHAR,duration INTEGER);");
        db.execSQL("CREATE TABLE Meals (mealname VARCHAR, kcal INTEGER, type VARCHAR,image VARCHAR,ingredients VARCHAR,method VARCHAR);");
        db.execSQL("CREATE TABLE WorkoutsTracker (username VARCHAR, level VARCHAR, type VARCHAR, duration VARCHAR, date VARCHAR);");

        db.execSQL("INSERT INTO Workouts VALUES ('15-Minute Beginners At-Home Cardio Workout | Class FitSugar','VHyGqsPOUHs','Beginner','Cardio',15)");
        db.execSQL("INSERT INTO Workouts VALUES ('10 MIN CARDIO / No Jumping - silent & neighbor friendly / No Equipment I Pamela Reif','gFeEUq2624Q','Beginner','Cardio',10 )");
        db.execSQL("INSERT INTO Workouts VALUES ('5 min Cardio for Beginners - No Equipment Home Workout - 40 second, 20 second Intervals','q2NZyW5EP5A','Beginner','Cardio',5 )");
        db.execSQL("INSERT INTO Workouts VALUES ('Morning Cardio Workout at Home for Beginners','tV7Xxz4F9To','Beginner','Cardio',10 )");
        db.execSQL("INSERT INTO Workouts VALUES ('5 Minute Cardio Workout [Intermediate]','1-ZrWSgi8do','Intermediate','Cardio',5 )");
        db.execSQL("INSERT INTO Workouts VALUES ('HIIT Cardio Circuit for INTERMEDIATE | HIIT Workout #2 | Men AND Women!','3wIb-TfiQwQ','Intermediate','Cardio',7 )");
        db.execSQL("INSERT INTO Workouts VALUES ('24Min Fat-Burning Cardio Workout - Intermediate | No Equipment | Get in Shape Fast','gjXh9Ehhf3E','Intermediate','Cardio',24 )");
        db.execSQL("INSERT INTO Workouts VALUES ('HIIT Cardio Circuit for ADVANCED | HIIT Workout #3 | Men AND Women!','jZhIEOmZ3q0','Advanced','Cardio',7 )");
        db.execSQL("INSERT INTO Workouts VALUES ('Advanced Cardio Workout For Seniors (Fitter in 5 - 5-Mins) | More Life Health','iJls4igxe3c','Advanced','Cardio',9 )");
        db.execSQL("INSERT INTO Workouts VALUES ('20 min Full Body HIIT Workout - Beginner Strength - 40s/40s Intervals','Kyv9iJf0gT8','Beginner','Strength',20 )");
        db.execSQL("INSERT INTO Workouts VALUES ('10 Minute Intermediate Strength Workout – At Home Strength Workout Routine With Weights','aEkaFBTh1oE','Intermediate','Strength',10 )");
        db.execSQL("INSERT INTO Workouts VALUES ('Advance Strength Training at Home | Total Body | Joanna Soh','JvU5LUg7kvc','Advanced','Strength',20 )");
        db.execSQL("INSERT INTO Workouts VALUES ('BEGINNER FLEXIBILITY ROUTINE (Stretches for the Inflexible)','qULTwquOuT4','Beginner','Flexibility',32 )");
        db.execSQL("INSERT INTO Workouts VALUES ('20 MIN STRETCHING EXERCISES FOR FLEXIBILITY | Full Body Stretch | Intermediate | Relaxing Music','AINaU0Oxdjo','Intermediate','Flexibility',21)");
        db.execSQL("INSERT INTO Workouts VALUES ('Back Flexibility Stretches (advanced)','vBvdHOhCuvQ','Advanced','Flexibility',10 )");
        db.execSQL("INSERT INTO Workouts VALUES ('3 Simple Balance Exercises For Beginners','kK9MQ0x5IDs','Beginner','Balance',6 )");
        db.execSQL("INSERT INTO Workouts VALUES ('Intermediate Balance Exercises For Seniors (Fitter in 5 - 5-Mins) | More Life Health','E1nrbYspnHY','Intermediate','Balance',8 )");
        db.execSQL("INSERT INTO Workouts VALUES ('Advanced Balance Exercises For Seniors (Fitter in 5 - 5-Mins) | More Life Health','PTxQv8bLm2I','Advanced','Balance',8 )");
        db.execSQL("INSERT INTO Workouts VALUES ('20 Minute Coordination-Building Workout for Beginners or Seniors','1BbKkPMHgNE','Beginner','Coordination',22 )");
        db.execSQL("INSERT INTO Workouts VALUES ('TOP 6 Balance and Coordination Exercises!','oL3StWt8ACM','Intermediate','Coordination',8 )");
        db.execSQL("INSERT INTO Workouts VALUES ('Advanced Coordination Skills | Dynamic Rapid Response | Ickey Shuffle Ladder Sequence','s13KBIdwvTs','Advanced','Coordination',4 )");



        db.execSQL("INSERT INTO Meals VALUES ('Poached eggs with broccoli, tomatoes & wholemeal flatbread',383, 'Breakfast','image1','100g thin-stemmed broccoli , trimmed and halved ,200g cherry tomatoes on the vine,4 medium free-range eggs (fridge cold),2 wholemeal flatbreads (see Goes well with for recipe) ,2 tsp mixed seeds (such as sunflower, pumpkin, sesame and linseed), 1 tsp olive oil ,good pinch of chilli flakes','STEP 1 Boil the kettle. Heat oven to 120C/100C fan/gas 1/2 and put an ovenproof plate inside to warm up. Fill a wide-based saucepan one-third full of water from the kettle and bring to the boil. Add the broccoli and cook for 2 mins. Add the tomatoes, return to the boil and cook for 30 secs. Lift out with tongs or a slotted spoon and place on the warm plate in the oven while you poach the eggs. STEP 2 ...Return the water to a gentle simmer. Break the eggs into the pan, one at a time, and cook for 2 1/2 - 3 mins or until the whites are set and the yolks are runny.STEP 3 ...Divide the flatbreads between the two plates and top with the broccoli and tomatoes. Use a slotted spoon to drain the eggs, then place on top. Sprinkle with the seeds and drizzle with the oil. Season with a little black pepper and the chilli flakes, and serve immediately.');");
        db.execSQL("INSERT INTO Meals VALUES ('Greek-style roast fish',388, 'Lunch','image2','5 small potatoes (about 400g), scrubbed and cut into wedges ,1 onion, halved and sliced,2 garlic cloves, roughly chopped , ½ tsp dried oregano or 1/2 tbsp chopped fresh oregano , 2 tbsp olive oil , ½ lemon, cut into wedges,2 large tomatoes, cut into wedges,2 fresh skinless pollock fillets (about 200g),small handful parsley, roughly chopped','STEP 1.... Heat oven to 200C/180C fan/gas 6. Tip the potatoes, onion, garlic, oregano and olive oil into a roasting tin, season, then mix together with your hands to coat everything in the oil. Roast for 15 mins, turn everything over and bake for 15 mins more.STEP 2 ...Add the lemon and tomatoes, and roast for 10 mins, then top with the fish fillets and cook for 10 mins more. Serve with parsley scattered over.');");
        db.execSQL("INSERT INTO Meals VALUES ('Prawn, dill & cucumber pasta',370, 'Dinner','image3','300g pasta shapes , small bunch chopped dill , juice ½ lemon , 5 tbsp half-fat soured cream , 300g North Atlantic cooked prawns , 1 cucumber , diced , 1 fennel bulb , shredded','STEP 1 ... Cook pasta shapes following pack instructions, drain and cool under running water. Tip into a bowl and toss with the dill, lemon, soured cream, prawns, cucumber and fennel. Season');");
        db.execSQL("INSERT INTO Meals VALUES ('Banana oat pancakes',350, 'Snack','image4','125ml oat milk , 2 eggs, separated , 1 small banana , 100g rolled oats , 2 tsp baking powder , few drops vanilla extract , oil, we used avocado oil spray , low fat yogurt and fruit to top','STEP 1 ...Put the oat milk, egg yolks, banana, oats, baking powder and vanilla in a blender and process to as smooth a mixture as you can get. Whisk the eggs whites until they hold stiff peaks. Whisk 1-2 tbsp of the whites into the batter, then fold in the rest. STEP 2 ...Heat a non-stick pan over a medium heat and spray with a whisper of oil, pour about 2 tbsp of batter into the pan and cook for 1-2 mins, until the base sets and bubbles appear all over the top. Flip and cook the other side for a minute. Repeat in batches, making sure the top looks dryish before attempting the flip, or the centre will collapse.');");
        db.execSQL("INSERT INTO Meals VALUES ('Slow cooker Turkish breakfast eggs',165 ,'Breakfast','image5','1 tbsp olive oil ,2 onions , finely sliced ,1 red pepper , cored and finely sliced ,1 small red chilli , finely sliced , 8 cherry tomatoes , 1 slice sourdough bread , cubed, 4 eggs , 2 tbsp skimmed milk , small bunch parsley , finely chopped,4 tbsp natural yogurt , to serve','STEP 1 ...Oil the inside of a small slow cooker and heat if necessary. Heat the remaining oil in a heavy-based frying pan. Stir in the onions, pepper and chilli. Cook until they begin to soften. Tip into the slow cooker and add the cherry tomatoes and bread and stir everything. Season.STEP 2 ...Whisk the eggs with the milk and parsley and pour this over the top, making sure all the other ingredients are covered. Cook for 5-6 hours. Serve with the yogurt')");
        db.execSQL("INSERT INTO Meals VALUES ('Seeded cheese & chive flapjacks', 166,'Snack','image6','100g butter ,250g porridge oats ,2 carrots , grated, 1 tbsp milled flaxseed ,1 tbsp chia seeds , 100g mature cheddar , grated , 2 large eggs , beaten , small bunch of chives , snipped, 2 tbsp mixed seeds (we used a mix of pumpkin, sunflower and sesame seeds)','STEP 1 ...Melt the butter in a large pan, then add the oats, carrots, flaxseed, chia seeds and some seasoning. Leave to cool for about 10 mins. Heat the oven to 200C/180C fan/gas 6 and line a 20 x 20cm baking tin with baking parchment.STEP 2 ...Stir the cheese, eggs and chives into the oat mix. Tip into the tin and scatter over the mixed seeds. Press down with the back of a spoon, making sure it fills the tin to the edges. Bake for 25-30 mins until golden. Leave to cool completely in the tin before cutting into bars.')");
        db.execSQL("INSERT INTO Meals VALUES ('Easy coronation chicken',463 ,'Dinner','image7','6 tbsp mayonnaise, 2-3 tsp mild curry powder, to taste , ½  tsp ground cinnamon , 2 tbsp mango chutney , 1-3 tbsp sultanas, or to taste, 500g shredded cooked chicken','STEP 1 ...Mix the mayo, curry powder, cinnamon, chutney and sultanas together and season with black pepper. STEP 2 ...Add the shredded chicken and stir to coat in the sauce. Stir in 2 tbsp water to loosen if needed, then season and serve as desired.')");
        db.execSQL("INSERT INTO Meals VALUES ('Courgette & goat’s cheese ciabatta',455 ,'Lunch','image8','1 large courgette , halved and then cut into thin slices , 2 tbsp olive oil , 1 ciabatta loaf, split down the middle and halved , 1 garlic clove , halved ,zest and juice 1 lemon,75g soft goats cheese , small bunch basil , finely shredded , salad , to serve (optional)','STEP 1 ...Drizzle the courgette slices with a little olive oil. Cook on a hot griddle pan (or in a frying pan) for about 2 mins on each side until tender. Toast the ciabatta and gently rub with the cut garlic clove. STEP 2 ...Whisk together the lemon juice with the remaining oil and some seasoning. Spread the ciabatta with the soft goat’s cheese and top with the courgette slices, a little dressing, the lemon zest and basil. Serve with a salad, if you like.')");
        db.execSQL("INSERT INTO Meals VALUES ('Gingerbread cookies',200 ,'Snack','image9','120g unsalted butter, softened,1½ tbsp black treacle,170g soft light brown sugar,½ tsp fine sea salt,1 medium egg,200g plain flour,¼ tsp bicarbonate of soda,¼ tsp ground cloves,1½ tsp ground ginger,½ tsp ground cinnamon,60g golden caster sugar','STEP 1 ...Beat together the butter, treacle, brown sugar and salt in a large mixing bowl. Add the egg, then beat through all of the remaining dry ingredients apart from the caster sugar. Chill the mixture in the fridge for 1 hr.STEP 2 ...Heat the oven to 200C/180C fan/gas 4. Line two baking sheets with baking parchment. Roll the mixture into 20 even-sized balls (weighing for accuracy, if you like). Tip the caster sugar onto a small plate, then add each ball and roll around to coat. Space each ball out on the baking sheets. Bake for 9-10 mins until golden brown. Leave to cool completely on a wire rack.')");
        db.execSQL("INSERT INTO Meals VALUES ('Vegetarian chilli', 560,'Lunch','image10','400g pack oven-roasted vegetables , 1 can kidney beans in chilli sauce , 1 can chopped tomatoes ,1 ready-to-eat mixed grain pouch','STEP 1...Heat oven to 200C/180C fan/ gas 6. Cook the vegetables in a casserole dish for 15 mins. Tip in the beans and tomatoes, season, and cook for another 10-15 mins until piping hot. Heat the pouch in the microwave on High for 1 min and serve with the chilli.')");
        db.execSQL("INSERT INTO Meals VALUES ('Strawberry smoothie',170,'Breakfast','image11','10 strawberries, hulled (approx 175g) , 1 small banana, sliced , 100ml orange juice, chilled','STEP 1...Blitz the strawberries in a blender with the banana and orange juice until smooth. STEP 2...Pour the smoothie into a tall glass to serve.')");
        db.execSQL("INSERT INTO Meals VALUES ('Radish & cucumber salad',90 ,'Dinner','image12','1 cucumber ,500g radish , quartered ,1 celery heart, sticks cut into 1cm pieces ,1 large red onion , thinly sliced ,bunch flat-leaf parsley , roughly chopped , 3 tbsp lemon juice, 6 tbsp rapeseed oil','STEP 1 ...Quarter the cucumber lengthways. Cut each quarter into roughly 1cm chunks, cutting on the angle to give a more interesting shape. Scatter into a serving bowl or onto a platter. Add the radishes, celery, onion and parsley.STEP 2 ...Put the lemon juice and oil in a glass jar with a lid, season and shake well. When ready to serve, pour the dressing over the salad and toss to combine.')");
        db.execSQL("INSERT INTO Meals VALUES ('Ploughman’s sandwich',630 ,'Breakfast','image13','1 medium baguette ,2 tbsp mayo , 1 heaped tsp wholegrain mustard , ½ small Braeburn apple , 3 slices smoked ham , 50g cheddar , sliced ,2 tbsp pickle or chutney ,handful of rocket','STEP 1 ...Slice the baguette in half lengthways. Mix the mayo with the mustard and cut the apple into thin slices. Spread the mayo mixture over the baguette base, then lay on the ham, cheese,  apple and the pickle or chutney. Finish with the rocket and the baguette top, then cut in half.')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS RegisteredUser");
        db.execSQL("DROP TABLE IF EXISTS Workouts");
        db.execSQL("DROP TABLE IF EXISTS Meals");
        db.execSQL("DROP TABLE IF EXISTS WorkoutsTracker");
        onCreate(db);
    }

    public long addUser(String user, String password,String email){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",user);
        contentValues.put("password",password);
        contentValues.put("email",email);
        long res = db.insert("RegisteredUser",null,contentValues);
        db.close();
        return  res;
    }

    public boolean checkUser(String username, String password){
        String[] columns = { "ID" };
        SQLiteDatabase db = getReadableDatabase();
        String selection = "username" + "=?" + " and " + "password" + "=?" ;
        String[] selectionArgs = { username, password };
        Cursor cursor = db.query("RegisteredUser",columns,selection,selectionArgs,null,null,null);
        int count = cursor.getCount();
        cursor.close();
        db.close();
        return count > 0;
    }

    public List<String> getAllWorkoutsURL(String level, String type) {
        List<String> workoutsURL = new ArrayList<String>();
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c1 = database.rawQuery("SELECT * FROM Workouts WHERE level LIKE '"+level+"' and type LIKE '"+type+"'" ,null );
        while(c1.moveToNext()) {
            workoutsURL.add(c1.getString(1));
        }
        c1.close();
        return workoutsURL;
    }
    public List<String> getMealByType(String type) {
        List<String> Meals = new ArrayList();
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c1 = database.rawQuery("SELECT * FROM Meals WHERE type LIKE '" + type + "'", null);
        while(c1.moveToNext()) {
            Meals.add(c1.getString(3));
        }
        c1.close();
        return Meals;
    }
    public String getName(String id) {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c1= database.rawQuery("SELECT * FROM Meals WHERE image LIKE '" + id + "'", null);
        if(c1.moveToNext()){
            return  c1.getString(0);
        }else{
            return null;
        }

    }

    public String getKcal(String id) {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c1= database.rawQuery("SELECT * FROM Meals WHERE image LIKE '" + id + "'", null);
        if(c1.moveToNext()){
            return  c1.getString(1);
        }else{
            return null;
        }
    }

    public String getIngredients(String id) {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c1= database.rawQuery("SELECT * FROM Meals WHERE image LIKE '" + id + "'", null);
        if(c1.moveToNext()){
            return  c1.getString(4);
        }else{
            return null;
        }
    }

    public String getMethod(String id) {
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c1= database.rawQuery("SELECT * FROM Meals WHERE image LIKE '" + id + "'", null);
        if(c1.moveToNext()){
            return  c1.getString(5);
        }else{
            return null;
        }
    }

    public long insertIntoWorkoutTracker(String username, String level, String type, String duration, String date) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("level", level);
        contentValues.put("type", type);
        contentValues.put("duration", duration);
        contentValues.put("date", date);
        long res = database.insert("WorkoutsTracker", null, contentValues);
        database.close();
        return  res;
    }


    public List<WorkoutConfirmModel> getUserTracker(String username) {

        SQLiteDatabase db = this.getReadableDatabase();
        try {
            onCreate(db);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<WorkoutConfirmModel> returnList = new ArrayList<>();

        String query = "SELECT * FROM WorkoutsTracker WHERE username =?";

        Cursor cursor = db.rawQuery(query,  new String[]{username});

        while(cursor.moveToNext()) {
            String level = cursor.getString(1);
            String  type=cursor.getString(2);
            String duration =cursor.getString(3);
            String date = cursor.getString(4);

            WorkoutConfirmModel workouttracker =
                    new WorkoutConfirmModel(username,level,type,duration, date);
            returnList.add(workouttracker);
        }
        cursor.close();
        db.close();

        return returnList;
    }

}

