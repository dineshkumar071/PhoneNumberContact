package com.example.dashboardproject.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.dashboardproject.Repository.Model.Name;
import com.example.dashboardproject.Repository.Model.ResultOne;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ContactDAO_Impl implements ContactDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ResultOne> __insertionAdapterOfResultOne;

  private final EntityInsertionAdapter<Name> __insertionAdapterOfName;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDataBase;

  public ContactDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResultOne = new EntityInsertionAdapter<ResultOne>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `ResultOne` (`gender`,`email`,`phone`,`cell`,`uid`) VALUES (?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ResultOne entity) {
        if (entity.getGender() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getGender());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEmail());
        }
        if (entity.getPhone() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getPhone());
        }
        if (entity.getCell() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCell());
        }
        if (entity.getUid() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getUid());
        }
      }
    };
    this.__insertionAdapterOfName = new EntityInsertionAdapter<Name>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `Name` (`title`,`first`,`last`,` uid`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Name entity) {
        if (entity.getTitle() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getTitle());
        }
        if (entity.getFirst() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getFirst());
        }
        if (entity.getLast() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getLast());
        }
        statement.bindLong(4, entity.getUid());
      }
    };
    this.__preparedStmtOfDeleteDataBase = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ResultOne";
        return _query;
      }
    };
  }

  @Override
  public void saveUser(final ResultOne user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfResultOne.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveUsers(final List<ResultOne> users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfResultOne.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveNames(final List<Name> names) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfName.insert(names);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDataBase() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDataBase.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteDataBase.release(_stmt);
    }
  }

  @Override
  public List<ResultOne> readUser() {
    final String _sql = "select * from ResultOne";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfCell = CursorUtil.getColumnIndexOrThrow(_cursor, "cell");
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final List<ResultOne> _result = new ArrayList<ResultOne>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ResultOne _item;
        _item = new ResultOne();
        final String _tmpGender;
        if (_cursor.isNull(_cursorIndexOfGender)) {
          _tmpGender = null;
        } else {
          _tmpGender = _cursor.getString(_cursorIndexOfGender);
        }
        _item.setGender(_tmpGender);
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        _item.setEmail(_tmpEmail);
        final String _tmpPhone;
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _tmpPhone = null;
        } else {
          _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        }
        _item.setPhone(_tmpPhone);
        final String _tmpCell;
        if (_cursor.isNull(_cursorIndexOfCell)) {
          _tmpCell = null;
        } else {
          _tmpCell = _cursor.getString(_cursorIndexOfCell);
        }
        _item.setCell(_tmpCell);
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        _item.setUid(_tmpUid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Name> readName() {
    final String _sql = "select * from Name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfFirst = CursorUtil.getColumnIndexOrThrow(_cursor, "first");
      final int _cursorIndexOfLast = CursorUtil.getColumnIndexOrThrow(_cursor, "last");
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, " uid");
      final List<Name> _result = new ArrayList<Name>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Name _item;
        _item = new Name();
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final String _tmpFirst;
        if (_cursor.isNull(_cursorIndexOfFirst)) {
          _tmpFirst = null;
        } else {
          _tmpFirst = _cursor.getString(_cursorIndexOfFirst);
        }
        _item.setFirst(_tmpFirst);
        final String _tmpLast;
        if (_cursor.isNull(_cursorIndexOfLast)) {
          _tmpLast = null;
        } else {
          _tmpLast = _cursor.getString(_cursorIndexOfLast);
        }
        _item.setLast(_tmpLast);
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        _item.setUid(_tmpUid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
