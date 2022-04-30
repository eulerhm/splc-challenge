package com.google.samples.apps.iosched.shared.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.FtsTableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile SessionFtsDao _sessionFtsDao;

  private volatile SpeakerFtsDao _speakerFtsDao;

  private volatile CodelabFtsDao _codelabFtsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS `sessionsFts` USING FTS4(`sessionId` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `speakers` TEXT NOT NULL)");
        _db.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS `speakersFts` USING FTS4(`speakerId` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL)");
        _db.execSQL("CREATE VIRTUAL TABLE IF NOT EXISTS `codelabsFts` USING FTS4(`codelabId` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '13383c94e630bb2fba40bf6dc741e5fb')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `sessionsFts`");
        _db.execSQL("DROP TABLE IF EXISTS `speakersFts`");
        _db.execSQL("DROP TABLE IF EXISTS `codelabsFts`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashSet<String> _columnsSessionsFts = new HashSet<String>(4);
        _columnsSessionsFts.add("sessionId");
        _columnsSessionsFts.add("title");
        _columnsSessionsFts.add("description");
        _columnsSessionsFts.add("speakers");
        final FtsTableInfo _infoSessionsFts = new FtsTableInfo("sessionsFts", _columnsSessionsFts, "CREATE VIRTUAL TABLE IF NOT EXISTS `sessionsFts` USING FTS4(`sessionId` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `speakers` TEXT NOT NULL)");
        final FtsTableInfo _existingSessionsFts = FtsTableInfo.read(_db, "sessionsFts");
        if (!_infoSessionsFts.equals(_existingSessionsFts)) {
          return new RoomOpenHelper.ValidationResult(false, "sessionsFts(com.google.samples.apps.iosched.shared.data.db.SessionFtsEntity).\n"
                  + " Expected:\n" + _infoSessionsFts + "\n"
                  + " Found:\n" + _existingSessionsFts);
        }
        final HashSet<String> _columnsSpeakersFts = new HashSet<String>(3);
        _columnsSpeakersFts.add("speakerId");
        _columnsSpeakersFts.add("name");
        _columnsSpeakersFts.add("description");
        final FtsTableInfo _infoSpeakersFts = new FtsTableInfo("speakersFts", _columnsSpeakersFts, "CREATE VIRTUAL TABLE IF NOT EXISTS `speakersFts` USING FTS4(`speakerId` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL)");
        final FtsTableInfo _existingSpeakersFts = FtsTableInfo.read(_db, "speakersFts");
        if (!_infoSpeakersFts.equals(_existingSpeakersFts)) {
          return new RoomOpenHelper.ValidationResult(false, "speakersFts(com.google.samples.apps.iosched.shared.data.db.SpeakerFtsEntity).\n"
                  + " Expected:\n" + _infoSpeakersFts + "\n"
                  + " Found:\n" + _existingSpeakersFts);
        }
        final HashSet<String> _columnsCodelabsFts = new HashSet<String>(3);
        _columnsCodelabsFts.add("codelabId");
        _columnsCodelabsFts.add("title");
        _columnsCodelabsFts.add("description");
        final FtsTableInfo _infoCodelabsFts = new FtsTableInfo("codelabsFts", _columnsCodelabsFts, "CREATE VIRTUAL TABLE IF NOT EXISTS `codelabsFts` USING FTS4(`codelabId` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL)");
        final FtsTableInfo _existingCodelabsFts = FtsTableInfo.read(_db, "codelabsFts");
        if (!_infoCodelabsFts.equals(_existingCodelabsFts)) {
          return new RoomOpenHelper.ValidationResult(false, "codelabsFts(com.google.samples.apps.iosched.shared.data.db.CodelabFtsEntity).\n"
                  + " Expected:\n" + _infoCodelabsFts + "\n"
                  + " Found:\n" + _existingCodelabsFts);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "13383c94e630bb2fba40bf6dc741e5fb", "5ebe8fdee7bad71fed45d64b52d0dc29");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(3);
    _shadowTablesMap.put("sessionsFts", "sessionsFts_content");
    _shadowTablesMap.put("speakersFts", "speakersFts_content");
    _shadowTablesMap.put("codelabsFts", "codelabsFts_content");
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "sessionsFts","speakersFts","codelabsFts");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `sessionsFts`");
      _db.execSQL("DELETE FROM `speakersFts`");
      _db.execSQL("DELETE FROM `codelabsFts`");
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
  public SessionFtsDao sessionFtsDao() {
    if (_sessionFtsDao != null) {
      return _sessionFtsDao;
    } else {
      synchronized(this) {
        if(_sessionFtsDao == null) {
          _sessionFtsDao = new SessionFtsDao_Impl(this);
        }
        return _sessionFtsDao;
      }
    }
  }

  @Override
  public SpeakerFtsDao speakerFtsDao() {
    if (_speakerFtsDao != null) {
      return _speakerFtsDao;
    } else {
      synchronized(this) {
        if(_speakerFtsDao == null) {
          _speakerFtsDao = new SpeakerFtsDao_Impl(this);
        }
        return _speakerFtsDao;
      }
    }
  }

  @Override
  public CodelabFtsDao codelabFtsDao() {
    if (_codelabFtsDao != null) {
      return _codelabFtsDao;
    } else {
      synchronized(this) {
        if(_codelabFtsDao == null) {
          _codelabFtsDao = new CodelabFtsDao_Impl(this);
        }
        return _codelabFtsDao;
      }
    }
  }
}
