package com.example.dashboardproject.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PNDatabase_Impl extends PNDatabase {
  private volatile ContactDAO _contactDAO;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `ContactModel` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `Id` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT, `id` INTEGER, `name` TEXT, `value` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ResultOne` (`gender` TEXT, `email` TEXT, `phone` TEXT, `cell` TEXT, `uid` INTEGER PRIMARY KEY AUTOINCREMENT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `Name` (`title` TEXT, `first` TEXT, `last` TEXT, ` uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db791203ab031bf7342b235c1cf7cf87')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `ContactModel`");
        db.execSQL("DROP TABLE IF EXISTS `Id`");
        db.execSQL("DROP TABLE IF EXISTS `ResultOne`");
        db.execSQL("DROP TABLE IF EXISTS `Name`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsContactModel = new HashMap<String, TableInfo.Column>(1);
        _columnsContactModel.put("uid", new TableInfo.Column("uid", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysContactModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesContactModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoContactModel = new TableInfo("ContactModel", _columnsContactModel, _foreignKeysContactModel, _indicesContactModel);
        final TableInfo _existingContactModel = TableInfo.read(db, "ContactModel");
        if (!_infoContactModel.equals(_existingContactModel)) {
          return new RoomOpenHelper.ValidationResult(false, "ContactModel(com.example.dashboardproject.Repository.Model.ContactModel).\n"
                  + " Expected:\n" + _infoContactModel + "\n"
                  + " Found:\n" + _existingContactModel);
        }
        final HashMap<String, TableInfo.Column> _columnsId = new HashMap<String, TableInfo.Column>(4);
        _columnsId.put("uid", new TableInfo.Column("uid", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsId.put("id", new TableInfo.Column("id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsId.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsId.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysId = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesId = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoId = new TableInfo("Id", _columnsId, _foreignKeysId, _indicesId);
        final TableInfo _existingId = TableInfo.read(db, "Id");
        if (!_infoId.equals(_existingId)) {
          return new RoomOpenHelper.ValidationResult(false, "Id(com.example.dashboardproject.Repository.Model.Id).\n"
                  + " Expected:\n" + _infoId + "\n"
                  + " Found:\n" + _existingId);
        }
        final HashMap<String, TableInfo.Column> _columnsResultOne = new HashMap<String, TableInfo.Column>(5);
        _columnsResultOne.put("gender", new TableInfo.Column("gender", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultOne.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultOne.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultOne.put("cell", new TableInfo.Column("cell", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsResultOne.put("uid", new TableInfo.Column("uid", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysResultOne = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesResultOne = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoResultOne = new TableInfo("ResultOne", _columnsResultOne, _foreignKeysResultOne, _indicesResultOne);
        final TableInfo _existingResultOne = TableInfo.read(db, "ResultOne");
        if (!_infoResultOne.equals(_existingResultOne)) {
          return new RoomOpenHelper.ValidationResult(false, "ResultOne(com.example.dashboardproject.Repository.Model.ResultOne).\n"
                  + " Expected:\n" + _infoResultOne + "\n"
                  + " Found:\n" + _existingResultOne);
        }
        final HashMap<String, TableInfo.Column> _columnsName = new HashMap<String, TableInfo.Column>(4);
        _columnsName.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsName.put("first", new TableInfo.Column("first", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsName.put("last", new TableInfo.Column("last", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsName.put(" uid", new TableInfo.Column(" uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysName = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesName = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoName = new TableInfo("Name", _columnsName, _foreignKeysName, _indicesName);
        final TableInfo _existingName = TableInfo.read(db, "Name");
        if (!_infoName.equals(_existingName)) {
          return new RoomOpenHelper.ValidationResult(false, "Name(com.example.dashboardproject.Repository.Model.Name).\n"
                  + " Expected:\n" + _infoName + "\n"
                  + " Found:\n" + _existingName);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "db791203ab031bf7342b235c1cf7cf87", "649f007db41fa40bd91e6b3cc3ad60c9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ContactModel","Id","ResultOne","Name");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ContactModel`");
      _db.execSQL("DELETE FROM `Id`");
      _db.execSQL("DELETE FROM `ResultOne`");
      _db.execSQL("DELETE FROM `Name`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ContactDAO.class, ContactDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ContactDAO userDOA() {
    if (_contactDAO != null) {
      return _contactDAO;
    } else {
      synchronized(this) {
        if(_contactDAO == null) {
          _contactDAO = new ContactDAO_Impl(this);
        }
        return _contactDAO;
      }
    }
  }
}
