import java.util.List;
public class SuperBuilderWithNonNull {
	public static class Parent {
		@lombok.NonNull
		final String nonNullParentField;
		@java.lang.SuppressWarnings("all")
		private static String $default$nonNullParentField() {
			return "default";
		}
		@java.lang.SuppressWarnings("all")
		public static abstract class ParentBuilder<C extends Parent, B extends ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			private boolean nonNullParentField$set;
			@java.lang.SuppressWarnings("all")
			private String nonNullParentField;
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B nonNullParentField(@lombok.NonNull final String nonNullParentField) {
				if (nonNullParentField == null) {
					throw new java.lang.NullPointerException("nonNullParentField is marked @NonNull but is null");
				}
				this.nonNullParentField = nonNullParentField;
				nonNullParentField$set = true;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderWithNonNull.Parent.ParentBuilder(nonNullParentField=" + this.nonNullParentField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ParentBuilderImpl extends ParentBuilder<Parent, ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public Parent build() {
				return new Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Parent(final ParentBuilder<?, ?> b) {
			if (b.nonNullParentField$set) this.nonNullParentField = b.nonNullParentField;
			 else this.nonNullParentField = Parent.$default$nonNullParentField();
			if (nonNullParentField == null) {
				throw new java.lang.NullPointerException("nonNullParentField is marked @NonNull but is null");
			}
		}
		@java.lang.SuppressWarnings("all")
		public static ParentBuilder<?, ?> builder() {
			return new ParentBuilderImpl();
		}
	}
	public static class Child extends Parent {
		@lombok.NonNull
		String nonNullChildField;
		@java.lang.SuppressWarnings("all")
		public static abstract class ChildBuilder<C extends Child, B extends ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			private String nonNullChildField;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B nonNullChildField(@lombok.NonNull final String nonNullChildField) {
				if (nonNullChildField == null) {
					throw new java.lang.NullPointerException("nonNullChildField is marked @NonNull but is null");
				}
				this.nonNullChildField = nonNullChildField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderWithNonNull.Child.ChildBuilder(super=" + super.toString() + ", nonNullChildField=" + this.nonNullChildField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ChildBuilderImpl extends ChildBuilder<Child, ChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected ChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public Child build() {
				return new Child(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Child(final ChildBuilder<?, ?> b) {
			super(b);
			this.nonNullChildField = b.nonNullChildField;
			if (nonNullChildField == null) {
				throw new java.lang.NullPointerException("nonNullChildField is marked @NonNull but is null");
			}
		}
		@java.lang.SuppressWarnings("all")
		public static ChildBuilder<?, ?> builder() {
			return new ChildBuilderImpl();
		}
	}
	public static void test() {
		Child x = Child.builder().nonNullChildField("child").nonNullParentField("parent").build();
	}
}
