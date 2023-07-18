package com.catalin.comicslibrary.model.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CharacterDao_Impl implements CharacterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DbCharacter> __insertionAdapterOfDbCharacter;

  private final EntityDeletionOrUpdateAdapter<DbCharacter> __deletionAdapterOfDbCharacter;

  private final EntityDeletionOrUpdateAdapter<DbCharacter> __updateAdapterOfDbCharacter;

  public CharacterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDbCharacter = new EntityInsertionAdapter<DbCharacter>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `character_table` (`id`,`apiId`,`name`,`thumbnail`,`comics`,`description`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbCharacter value) {
        stmt.bindLong(1, value.getId());
        if (value.getApiId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getApiId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getThumbnail());
        }
        if (value.getComics() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getComics());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
      }
    };
    this.__deletionAdapterOfDbCharacter = new EntityDeletionOrUpdateAdapter<DbCharacter>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `character_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbCharacter value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfDbCharacter = new EntityDeletionOrUpdateAdapter<DbCharacter>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `character_table` SET `id` = ?,`apiId` = ?,`name` = ?,`thumbnail` = ?,`comics` = ?,`description` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbCharacter value) {
        stmt.bindLong(1, value.getId());
        if (value.getApiId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getApiId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getThumbnail());
        }
        if (value.getComics() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getComics());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public void addCharacter(final DbCharacter character) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDbCharacter.insert(character);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCharacter(final DbCharacter character) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDbCharacter.handle(character);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCharacter(final DbCharacter character) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDbCharacter.handle(character);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<DbCharacter>> getCharacters() {
    final String _sql = "SELECT * FROM character_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"character_table"}, new Callable<List<DbCharacter>>() {
      @Override
      public List<DbCharacter> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfApiId = CursorUtil.getColumnIndexOrThrow(_cursor, "apiId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfComics = CursorUtil.getColumnIndexOrThrow(_cursor, "comics");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<DbCharacter> _result = new ArrayList<DbCharacter>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DbCharacter _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpApiId;
            if (_cursor.isNull(_cursorIndexOfApiId)) {
              _tmpApiId = null;
            } else {
              _tmpApiId = _cursor.getInt(_cursorIndexOfApiId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnail;
            if (_cursor.isNull(_cursorIndexOfThumbnail)) {
              _tmpThumbnail = null;
            } else {
              _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            }
            final String _tmpComics;
            if (_cursor.isNull(_cursorIndexOfComics)) {
              _tmpComics = null;
            } else {
              _tmpComics = _cursor.getString(_cursorIndexOfComics);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item = new DbCharacter(_tmpId,_tmpApiId,_tmpName,_tmpThumbnail,_tmpComics,_tmpDescription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<DbCharacter> getCharacter(final int characterId) {
    final String _sql = "SELECT * FROM character_table WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, characterId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"character_table"}, new Callable<DbCharacter>() {
      @Override
      public DbCharacter call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfApiId = CursorUtil.getColumnIndexOrThrow(_cursor, "apiId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfComics = CursorUtil.getColumnIndexOrThrow(_cursor, "comics");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final DbCharacter _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpApiId;
            if (_cursor.isNull(_cursorIndexOfApiId)) {
              _tmpApiId = null;
            } else {
              _tmpApiId = _cursor.getInt(_cursorIndexOfApiId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpThumbnail;
            if (_cursor.isNull(_cursorIndexOfThumbnail)) {
              _tmpThumbnail = null;
            } else {
              _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            }
            final String _tmpComics;
            if (_cursor.isNull(_cursorIndexOfComics)) {
              _tmpComics = null;
            } else {
              _tmpComics = _cursor.getString(_cursorIndexOfComics);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _result = new DbCharacter(_tmpId,_tmpApiId,_tmpName,_tmpThumbnail,_tmpComics,_tmpDescription);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
