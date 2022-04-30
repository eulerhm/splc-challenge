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
public final class SessionFtsDao_Impl implements SessionFtsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SessionFtsEntity> __insertionAdapterOfSessionFtsEntity;

  public SessionFtsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSessionFtsEntity = new EntityInsertionAdapter<SessionFtsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sessionsFts` (`sessionId`,`title`,`description`,`speakers`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SessionFtsEntity value) {
        if (value.getSessionId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSessionId());
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
        if (value.getSpeakers() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSpeakers());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<SessionFtsEntity> sessions) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSessionFtsEntity.insert(sessions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<String> searchAllSessions(final String query) {
    final String _sql = "SELECT sessionId FROM sessionsFts WHERE sessionsFts MATCH ?";
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
