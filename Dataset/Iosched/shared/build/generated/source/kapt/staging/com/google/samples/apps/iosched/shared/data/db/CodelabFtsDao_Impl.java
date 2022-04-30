package com.google.samples.apps.iosched.shared.data.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CodelabFtsDao_Impl implements CodelabFtsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CodelabFtsEntity> __insertionAdapterOfCodelabFtsEntity;

  public CodelabFtsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCodelabFtsEntity = new EntityInsertionAdapter<CodelabFtsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `codelabsFts` (`codelabId`,`title`,`description`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CodelabFtsEntity value) {
        if (value.getCodelabId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCodelabId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<CodelabFtsEntity> codelabs) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCodelabFtsEntity.insert(codelabs);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<String> searchAllCodelabs(final String query) {
    final String _sql = "SELECT codelabId FROM codelabsFts WHERE codelabsFts MATCH ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        final String _tmp;
        _tmp = _cursor.getString(0);
        _item = _tmp;
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
